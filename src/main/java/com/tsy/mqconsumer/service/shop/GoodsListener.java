package com.tsy.mqconsumer.service.shop;

import com.google.gson.Gson;
import com.tsy.mqconsumer.model.shop.TShopGoods;
import com.tsy.mqconsumer.util.JsonUtil;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrInputDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.tsy.mqconsumer.rabbitmq.config.RpcRabbitConfig.QUEUE_ASYNC_RPC;
import static com.tsy.mqconsumer.rabbitmq.config.RpcRabbitConfig.QUEUE_SYNC_RPC;

@Service("goodsListener")
public class GoodsListener {
    private final static Logger log = LoggerFactory.getLogger(GoodsListener.class);

    @Autowired
    private SolrClient client;

    @RabbitHandler
    @RabbitListener(queues = "goodsUpdate")
    public void goodsUpdate(String message) {
        log.info("message:{}",message);
        Gson gson = new Gson();
        TShopGoods goods = gson.fromJson(message, TShopGoods.class);

        SolrInputDocument sid = new SolrInputDocument();
        sid.setField("id",goods.getGoodsid());
        sid.setField("title",goods.getGoodsname());
        sid.setField("subject",goods.getGoodssubtitle());

        try {
            client.add(sid);
            client.commit();
        } catch (Exception e) {
            log.error("创建solr索引失败",e);
        }
    }

    /**
     * 搜索商品
     * @param message 搜索关键字
     * @return 搜索结果
     */
    @RabbitHandler
    @RabbitListener(queues = QUEUE_SYNC_RPC)
    public String searchGoods(String message){
        log.info("searchGoods:{}",message);
        SolrQuery solrQuery = new SolrQuery();
        solrQuery.set("q","title:"+message+" OR subject:"+message);//
        try {
            QueryResponse response = client.query(solrQuery);

            log.info("搜索结果:{}",JsonUtil.object2Json(response.getResults()));
            return JsonUtil.object2Json(response.getResults());
        } catch (Exception e) {
            log.error("searchGoods异常",e);
            return null;
        }
    }
}

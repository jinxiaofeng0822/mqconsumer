package com.tsy.mqconsumer.controller.solr;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class SolrController {

    @Autowired
    private SolrClient client;

    @RequestMapping("testSolr")
    public String testSolr(){
        System.out.println("testSolr");
        try {
            SolrDocument document = client.getById("8");

            System.out.println(document);
            return document.toString();
        } catch (SolrServerException e) {
            e.printStackTrace();
            return "SolrServerException";
        } catch (IOException e) {
            e.printStackTrace();
            return "IOException";
        }
    }

    @RequestMapping("solrQuery")
    public String solrQuery(){
        System.out.println("solrQuery");
        SolrQuery solrQuery = new SolrQuery();
        solrQuery.set("q","一");
        try {
            QueryResponse response = client.query(solrQuery);
            SolrDocumentList list = response.getResults();
            for (int i = 0; i <list.size() ; i++) {
                System.out.println(list.get(i));
            }
            return "成功结束";
        } catch (SolrServerException e) {
            e.printStackTrace();
            return "SolrServerException";
        } catch (IOException e) {
            e.printStackTrace();
            return "IOException";
        }
    }

    @RequestMapping("add")
    public String addDocument(){
        String title1 = "来看看这群高龄老人的饮食经验";
        String content1 = "以下内容来自「丁香医生」www.dxy.com\n" +
                "现在生活条件和医疗条件，不知道比三四十年前好了多少倍。却有很多老人感觉活得很累，甚至很痛苦。\n" +
                "为什么？到底出现了什么问题？\n" +
                "丁当特别咨询了中国人民解放军陆军总医院营养师于仁文。他对这事儿很有发言权。\n" +
                "营养师于仁文主要负责中国人民解放军陆军总医院各类老年病、营养代谢性慢性疾病、手术及放化疗后，病人的膳食营养工作。\n" +
                "除此之外，他还担任了北京营养师协会理事、中国烹饪协会专家委委员、中国老年学学会食品营养专业委员会委员、北京抗癌协会青年委员会委员。\n" +
                "在 2015 年，他更是受命担任 9·3 阅兵抗战老兵方队的专职营养师。\n" +
                "作者：于仁文 ，未经许可请勿转载。查看原文：https://dxy.com/column/9820";
//        String title2 = "总是脖子疼，选什么枕头比较好";
//        String content2 = "以下内容来自「丁香医生」www.dxy.com\n" +
//                "如果每天早上起来都感觉脖子肩膀酸痛、僵硬，很可能是枕头不合适。选枕头，不论价格多贵，材料多高科技，满足下面三个条件的枕头才是适合你的好枕头。\n" +
//                "一、枕头压缩后，相等于竖起来的一个拳头的高度，这样枕上去，高矮是合适的；\n" +
//                "二、枕到上面，脖子能感觉被自然地托住了，支撑脖子的地方，比后脑勺高 3～5 厘米，这样是最舒服的；\n" +
//                "三、枕头宽度要够，枕头的宽度至少是肩宽的 1.5 倍，这样睡觉的时候，脑袋不容易从枕头上掉下来。\n" +
//                "还有一点很重要，就是枕枕头的时候，要把脑袋和脖子都放到枕头上，这样枕头才能发挥作用。如果仅仅是头顶挨个枕头的边，多好的枕头，都没用。\n" +
//                "作者：来问丁香医生 ，未经许可请勿转载。查看原文：https://dxy.com/column/9824";
//        String title1 = "脖子痛，这样做才有效";
//        String content1 = "以下内容来自「丁香医生」www.dxy.com\n" +
//                "脖子痛是很多人的苦恼。\n" +
//                "据估计，22% 至 70% 的人会在一生中至少出现一次脖子痛的情况。因为大家使用手机、电脑的时间大大增加，这一数字还在逐年上升。\n" +
//                "可怕的是，它的复发率和转变为慢性病的几率很高，如果选错了正确的治疗方案，很影响生活质量。\n" +
//                "脖子痛了去按一按，是不少人的第一反应。\n" +
//                "而类似下面这样的新闻的不断出现，让大家害怕又困惑：\n" +
//                "作者：杨一 ，未经许可请勿转载。查看原文：https://dxy.com/column/10315";
        SolrInputDocument sid1 = new SolrInputDocument();
        sid1.setField("id","3");
        sid1.setField("title",title1);
        sid1.setField("my_field1",content1);
//
//        SolrInputDocument sid2 = new SolrInputDocument();
//        sid2.setField("id","2");
//        sid2.setField("title",title2);
//        sid2.setField("my_field1",content2);
        try {
            System.out.println("开始提交sid1");
            client.add(sid1);
            client.commit();
//            System.out.println("开始提交sid2");
//            client.add(sid2);
//            client.commit();
//            System.out.println("全部提交完毕");
        } catch (SolrServerException e) {
            e.printStackTrace();
            return "SolrServerException";
        } catch (IOException e) {
            e.printStackTrace();
            return "IOException";
        }
        return "添加文档成功";
    }

    @RequestMapping("/searchSolr")
    public String searchSolr(){

        SolrQuery sq = new SolrQuery();
        sq.set("q","脖子痛");

        QueryResponse response = null;
        try {
            response = client.query(sq);
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        SolrDocumentList list = response.getResults();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("jieshu");
        return "正常结束";
    }
}

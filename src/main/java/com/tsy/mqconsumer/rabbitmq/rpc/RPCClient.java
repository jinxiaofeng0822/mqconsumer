package com.tsy.mqconsumer.rabbitmq.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import static com.tsy.mqconsumer.rabbitmq.config.RpcRabbitConfig.QUEUE_ASYNC_RPC;
import static com.tsy.mqconsumer.rabbitmq.config.RpcRabbitConfig.QUEUE_SYNC_RPC;

@Component
public class RPCClient {

	private final static Logger log = LoggerFactory.getLogger(RPCClient.class);

	@Autowired
	AmqpTemplate amqpTemplate;
	
	public String send(String message) {
		String result = (String) amqpTemplate.convertSendAndReceive(QUEUE_SYNC_RPC, message);
		log.info("进入RPCClient.send result:{}",result);
		return result;
	}

	public String send2(String message) {
		String result = (String) amqpTemplate.convertSendAndReceive(QUEUE_SYNC_RPC, message);
		log.info("进入RPCClient.send222 result:{}",result);
		return result;
	}

	public String searchGoods(String searchWord){
		String result = (String) amqpTemplate.convertSendAndReceive(QUEUE_SYNC_RPC, searchWord);
		log.info("searchGoods:{}",result);
		return result;
	}
}

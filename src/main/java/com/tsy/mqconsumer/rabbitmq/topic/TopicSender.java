package com.tsy.mqconsumer.rabbitmq.topic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSender {

	private final static Logger log = LoggerFactory.getLogger(TopicSender.class);

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void sendInfo() {
		String context = "hi, i am log.info";
		log.info("TopicSender类，sendInfo方法。{}",context);
		this.rabbitTemplate.convertAndSend("topicExchange", "lll.iii", context);
	}

	public void sendDebug() {
		String context = "hi, i am log.debug";
		log.info("TopicSender类，sendDebug方法。{}",context);
		this.rabbitTemplate.convertAndSend("topicExchange", "lll.ddd", context);
	}

	public void sendAll() {
		String context = "sendAllsendAllsendAllsendAll";
		log.info("TopicSender类，sendAll方法。{}",context);
		this.rabbitTemplate.convertAndSend("topicExchange", "lll.*", context);
	}

}
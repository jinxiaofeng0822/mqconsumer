package com.tsy.mqconsumer.rabbitmq.topic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TopicReceiverInfo {

    private final static Logger log = LoggerFactory.getLogger(TopicReceiverInfo.class);

    @RabbitHandler
    @RabbitListener(queues = "log.info")
    public void process(String message) {
        log.info("Topic log.info  : {}",message);
    }

}

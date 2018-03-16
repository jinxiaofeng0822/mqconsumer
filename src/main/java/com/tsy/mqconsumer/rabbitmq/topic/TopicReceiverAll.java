package com.tsy.mqconsumer.rabbitmq.topic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TopicReceiverAll {

    private final static Logger log = LoggerFactory.getLogger(TopicReceiverAll.class);

    @RabbitHandler
    @RabbitListener(queues = "log.jxf")
    public void process(String message) {
        log.info("Topic TopicReceiverAll log.jxf  : {}",message);
    }
}

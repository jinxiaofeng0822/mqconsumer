package com.tsy.mqconsumer.rabbitmq.direct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    private static final Logger logger = LoggerFactory.getLogger(Receiver.class);

    @Autowired
    private AmqpTemplate rabbitTemplate;

    //    @RabbitHandler
    @RabbitListener(queues = "healthtest")
    public void process(byte[] msg) {
        try {
            String s = new String(msg, "utf-8");
            logger.info("mqconsumer接收到字节数组消息：{}", msg);
            logger.info("mqconsumer接收到字符串消息：{}", s);

        } catch (Exception e) {
            System.err.println(e);
        }
    }



}

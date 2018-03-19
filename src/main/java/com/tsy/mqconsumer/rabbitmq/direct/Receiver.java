package com.tsy.mqconsumer.rabbitmq.direct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    private static final Logger log = LoggerFactory.getLogger(Receiver.class);

    private int count = 0;

    @RabbitListener(queues = "healthtest")
    public void process(String msg) {
        count++;
        try {
//            String s = new String(msg, "utf-8");
            log.info("mqconsumer接收到消息：{}", msg);
//            log.info("mqconsumer接收到字符串消息：{}", s);
            log.info("第"+count+"个");
        } catch (Exception e) {
            System.err.println(e);
        }
    }



}

package com.tsy.mqconsumer.rabbitmq.direct;

import com.sun.media.sound.SoftMixingMainMixer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {
    private static Logger log = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String sendInfo) {
        this.rabbitTemplate.convertAndSend("healthtest", sendInfo);
    }

}

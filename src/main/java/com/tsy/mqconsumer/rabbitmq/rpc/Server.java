package com.tsy.mqconsumer.rabbitmq.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static com.tsy.mqconsumer.rabbitmq.config.RpcRabbitConfig.QUEUE_SYNC_RPC;

@Component
public class Server {

    private final static Logger log = LoggerFactory.getLogger(Server.class);

    private int count = 0;

    @RabbitHandler
    @RabbitListener(queues = QUEUE_SYNC_RPC)
    public String process(String message){
        count++;
        log.info("进入rpc server");
        log.info("收到的message：{}",message);
        log.info("第{}个",count);
        return "mqconsumer";
    }
}

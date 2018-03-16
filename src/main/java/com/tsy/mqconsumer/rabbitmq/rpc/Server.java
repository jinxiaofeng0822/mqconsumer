package com.tsy.mqconsumer.rabbitmq.rpc;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static com.tsy.mqconsumer.rabbitmq.config.RpcRabbitConfig.QUEUE_SYNC_RPC;

@Component
public class Server {

    @RabbitHandler
    @RabbitListener(queues = QUEUE_SYNC_RPC)
    public String process(String message){
        System.out.println("进入rpc server");
        System.out.println("收到的message："+message);
        return "mqconsumer";
    }
}

package com.tsy.mqconsumer.rabbitmq;

import com.tsy.mqconsumer.rabbitmq.rpc.RPCClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqRPCTest {
    @Autowired
    RPCClient client;

    @Test
    public void rpcTest(){
        System.out.println(client);
        client.send("RabbitMqRPCTest");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

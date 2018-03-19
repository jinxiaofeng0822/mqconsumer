package com.tsy.mqconsumer.controller.rabbitmq;

import com.tsy.mqconsumer.rabbitmq.rpc.RPCClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MqController {
    @Autowired
    private RPCClient client;

    @RequestMapping("rpc")
    public String rpc(){
        for (int i = 0; i < 20; i++) {
            client.send("MqController。rpc");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "成功";
    }

    @RequestMapping("rpc2")
    public String rpc2(){
        for (int i = 0; i < 1000; i++) {
            client.send2("MqController。rpc2");
        }
        return "成功";
    }
}

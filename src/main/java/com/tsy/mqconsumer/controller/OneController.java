package com.tsy.mqconsumer.controller;

import com.tsy.mqconsumer.dao.mapper.Table0130Mapper;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsy.mqconsumer.rabbitmq.direct.Sender;

@RestController
public class OneController {

    @Autowired
    Sender sender;

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Autowired
    private Table0130Mapper mapper;

    @RequestMapping("ttt")
    public String ttt(){
        System.out.println("ccccccccccccccccc");
        System.out.println(mapper.selectByPrimaryKey(2451));
        return "mqmq";
    }
}

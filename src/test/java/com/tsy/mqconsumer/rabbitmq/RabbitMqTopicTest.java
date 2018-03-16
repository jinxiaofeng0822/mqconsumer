package com.tsy.mqconsumer.rabbitmq;

import com.tsy.mqconsumer.rabbitmq.topic.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqTopicTest {
	@Autowired
    private TopicSender ts;

	@Test
	public void topicInfoTest(){
		//log.info队列
		ts.sendInfo();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void topicDebugTest(){
		//log.debug队列
		ts.sendDebug();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void topicAllTest(){
		//log.jxf队列
		ts.sendAll();
		ts.sendAll();
		ts.sendAll();
		ts.sendAll();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

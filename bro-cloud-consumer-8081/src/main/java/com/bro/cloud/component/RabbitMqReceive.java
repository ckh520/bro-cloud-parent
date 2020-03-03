package com.bro.cloud.component;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName:RabbitMqSender
 * @Description:TODO
 * @Author:admin
 * @Date:2020/2/23 13:12
 * @Version:V1.0
 */
@Component
@RabbitListener(queues = {"ckh.direct.queue"})
public class RabbitMqReceive {


    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Value("${ckhDirectQueue}")
    private String ckhDirectQueue;

    //接收消息
    public Object receive(String msg) {
        return rabbitTemplate.receiveAndConvert(ckhDirectQueue);
    }

//    //监听消息
//    @RabbitHandler
//    public void listener1(String msg) {
//        System.out.println("listener1:"+msg);
//    }

    //监听消息
    @RabbitHandler

    public void listener2(String msg) {
        System.out.println("listener2:"+msg);

    }

}

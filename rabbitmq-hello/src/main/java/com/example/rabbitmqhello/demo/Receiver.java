package com.example.rabbitmqhello.demo;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author yaobo
 * @version 1.0
 * @date 2020/5/11 22:32
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {
    @RabbitHandler
    public void process(String msg) {
        System.out.println("Receiver " + msg);
    }
}

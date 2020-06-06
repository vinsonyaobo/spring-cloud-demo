package com.example.rabbitmqhello.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author yaobo
 * @version 1.0
 * @date 2020/5/11 22:27
 */
@Component
public class Sender {
    private final AmqpTemplate amqpTemplate;

    public Sender(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public void send() {
        String msg = "hello " + new Date();
        System.out.println("Sender" + msg);
        this.amqpTemplate.convertAndSend("hello", msg);
    }
}

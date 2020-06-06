package com.example.rabbitmqhello.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author yaobo
 * @version 1.0
 * @date 2020/5/11 22:58
 */
@Component
@Order(1)
public class RabbitService implements ApplicationRunner {

    private final Sender sender;

    public RabbitService(Sender sender) {
        this.sender = sender;
    }

    @Override
    public void run(ApplicationArguments args) {
        sender.send();
    }

    public void hello() {
        sender.send();
    }
}

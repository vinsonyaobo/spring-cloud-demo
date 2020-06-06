package com.example.rabbitmqhello.demo;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yaobo
 * @version 1.0
 * @date 2020/5/11 22:35
 */
@Configuration
public class RabbitMQConfig {
    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
}

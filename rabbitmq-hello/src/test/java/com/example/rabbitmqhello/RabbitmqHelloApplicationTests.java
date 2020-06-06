package com.example.rabbitmqhello;

import com.example.rabbitmqhello.demo.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqHelloApplicationTests {

    @Autowired
    private Sender sender;

    @Test
    void contextLoads() {
    }

    @Test
    public void hello() {
        sender.send();
    }

}

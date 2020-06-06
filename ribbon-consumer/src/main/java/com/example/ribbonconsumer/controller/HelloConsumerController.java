package com.example.ribbonconsumer.controller;

import com.example.ribbonconsumer.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yaobo
 * @version 1.0
 * @date 2020/6/2 12:42
 */
@RestController
public class HelloConsumerController {

    final
    HelloService helloService;

    public HelloConsumerController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping(value = "/ribbon-hello")
    public String getHello() {
        return helloService.hello();
    }
}

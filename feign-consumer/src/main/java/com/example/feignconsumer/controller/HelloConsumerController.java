package com.example.feignconsumer.controller;

import com.example.feignconsumer.model.User;
import com.example.feignconsumer.service.HelloService;
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

    @GetMapping(value = "/feign-hello")
    public String getHello() {
        return helloService.hello() + "\r\n" +
                helloService.hello("DIDI") + "\r\n" +
                helloService.hello("DIDI", 18) + "\r\n" +
                helloService.hello(new User("DIDI", 18)) + "\r\n";
    }
}

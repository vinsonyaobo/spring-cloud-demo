package com.example.ribbonconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author yaobo
 * @version 1.0
 * @date 2020/6/2 21:29
 */
@Service
public class HelloService {
    final
    RestTemplate restTemplate;

    public HelloService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello() {
        return restTemplate.getForEntity("http://hello-service/hello", String.class).getBody();
    }

    public String helloFallback() {
        return "error";
    }
}

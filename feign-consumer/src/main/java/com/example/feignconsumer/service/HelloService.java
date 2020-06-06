package com.example.feignconsumer.service;

import com.example.feignconsumer.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author yaobo
 * @version 1.0
 * @date 2020/6/2 21:29
 */
@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

    @RequestMapping(value = "hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "hello2", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "hello3", method = RequestMethod.POST)
    String hello(@RequestBody User user);
}

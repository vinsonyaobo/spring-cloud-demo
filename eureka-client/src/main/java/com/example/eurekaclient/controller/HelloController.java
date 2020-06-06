package com.example.eurekaclient.controller;

import com.example.eurekaclient.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author yaobo
 * @version 1.0
 * @date 2020/6/1 22:38
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello1")
    public String hello(@RequestParam String name) {
        return "hello" + name;
    }

    @GetMapping("/hello2")
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(name, age);
    }

    @PostMapping("/hello3")
    public String hello(@RequestBody User user) {
        return "hello" + user.getName() + ", " + user.getAge();
    }
}

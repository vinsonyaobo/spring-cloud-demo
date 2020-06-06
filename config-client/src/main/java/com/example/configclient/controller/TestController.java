package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yaobo
 * @version 1.0
 * @date 2020/5/12 23:33
 */
@RestController
@RequestMapping("test")
@RefreshScope
public class TestController {

    @Value("${active}")
    private String active;

    @RequestMapping("active")
    public String active() {
        return active;
    }
}

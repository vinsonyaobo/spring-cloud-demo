package com.example.feignconsumer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author yaobo
 * @version 1.0
 * @date 2020/6/3 13:39
 */
@Setter
@Getter
@AllArgsConstructor
@ToString
public class User {
    private String name;
    private Integer age;
}

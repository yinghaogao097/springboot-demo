package org.javaboy.springbootgithubdemo.controller;

import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：Achen
 */
@RestController
public class HelloController {
    public String hello() {
        return "hello github啊啊啊";
    }
}

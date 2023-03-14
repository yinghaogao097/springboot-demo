package org.javaboy.springbootgithubdemo.controller;

import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：Achen
 */
@RestController
public class HelloController2 {
    public String hello() {
        return "hello github";
    }
}

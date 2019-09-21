package com.lifex360.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${server.port}")
    String port;

    @GetMapping(value = "/register")
    public String register() {
        System.out.println("UserController.register--------------");
        return "user register success,run port:" + port;
    }
}

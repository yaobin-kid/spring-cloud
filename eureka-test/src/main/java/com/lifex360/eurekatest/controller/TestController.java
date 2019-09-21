package com.lifex360.eurekatest.controller;

import com.lifex360.eurekatest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/account")
    public String account() {
        return userService.register();
    }
}

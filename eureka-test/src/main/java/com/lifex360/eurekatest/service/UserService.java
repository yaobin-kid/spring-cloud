package com.lifex360.eurekatest.service;

import com.lifex360.eurekatest.service.failed.UserServiceFailed;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "user-provider",fallback = UserServiceFailed.class,path = "/user")
public interface UserService {

    @RequestMapping(value = "/register")
    String register();
}

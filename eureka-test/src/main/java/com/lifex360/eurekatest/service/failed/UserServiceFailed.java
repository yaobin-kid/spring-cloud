package com.lifex360.eurekatest.service.failed;

import com.lifex360.eurekatest.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFailed implements UserService {
    @Override
    public String register() {
        return "register failed...";
    }
}

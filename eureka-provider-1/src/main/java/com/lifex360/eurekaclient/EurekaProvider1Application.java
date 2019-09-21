package com.lifex360.eurekaclient;

import com.lifex360.eurekaclient.bean.Account;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class EurekaProvider1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider1Application.class, args);
    }



}

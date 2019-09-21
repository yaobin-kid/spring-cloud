package com.lifex360.eurekaclient;

import com.lifex360.eurekaclient.bean.Account;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

//服务生产者
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class EurekaProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider2Application.class, args);
    }




}

package com.rainlf.springcloud.action.common.service.b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CommonServiceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonServiceBApplication.class, args);
    }

}

package com.rainlf.springcloud.action.common.service.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CommonServiceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonServiceAApplication.class, args);
    }

}

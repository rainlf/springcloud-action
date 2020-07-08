package com.rainlf.springcloud.action.consumer.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : rain
 * @date : 2020/7/8 16:32
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String test() {
        return restTemplate.getForEntity("http://COMMON-SERVICE/", String.class).getBody();
    }

    @HystrixCommand(fallbackMethod = "fallback")
    public String oneBook() {
        return restTemplate.getForEntity("http://COMMON-SERVICE/book", String.class).getBody();
    }

    public String fallback() {
        return "safe error";
    }
}

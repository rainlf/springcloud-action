package com.rainlf.springcloud.action.gateway.zuul;

import com.netflix.zuul.ZuulFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : rain
 * @date : 2020/7/8 18:35
 */
@Configuration
public class CustomerFilterConfig {

    @Bean
    public ZuulFilter customerPreFilter() {
        return new CustomerPreFilter();
    }
}

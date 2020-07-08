package com.rainlf.springcloud.action.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : rain
 * @date : 2020/7/8 17:25
 */
@FeignClient(contextId = "test", value = "COMMON-SERVICE")
public interface FeignService {

    @GetMapping("")
    String test();
}

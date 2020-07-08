package com.rainlf.springcloud.action.common.service.a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : rain
 * @date : 2020/7/8 15:24
 */
@RestController
@RequestMapping("")
public class TestController {

    @GetMapping("")
    public String test() {
        return "I am server A";
    }

}

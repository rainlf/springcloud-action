package com.rainlf.springcloud.action.consumer.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : rain
 * @date : 2020/7/8 17:12
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private FeignService feignService;

    @Autowired
    private FeignBookService feignBookService;

    @GetMapping("")
    public String test() {
        return feignService.test();
    }

    @GetMapping("/book")
    public String oneBook() {
        return feignBookService.oneBook();
    }

    @GetMapping("/book/timeout")
    public String timeoutBook() throws InterruptedException {
        return feignBookService.timeoutBook();
    }
}

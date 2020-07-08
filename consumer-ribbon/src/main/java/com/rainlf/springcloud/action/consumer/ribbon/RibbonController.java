package com.rainlf.springcloud.action.consumer.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : rain
 * @date : 2020/7/8 16:31
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("")
    public String test() {
        return ribbonService.test();
    }

    @GetMapping("/book")
    public String oneBook() {
        return ribbonService.oneBook();
    }
}

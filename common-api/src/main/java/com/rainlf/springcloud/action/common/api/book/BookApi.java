package com.rainlf.springcloud.action.common.api.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : rain
 * @date : 2020/7/8 15:06
 */
@RequestMapping("/book")
public interface BookApi {

    @GetMapping("")
    String oneBook();

    @GetMapping("/timeout")
    String timeoutBook() throws InterruptedException;
}

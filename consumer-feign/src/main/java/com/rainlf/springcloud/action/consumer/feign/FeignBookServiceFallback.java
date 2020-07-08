package com.rainlf.springcloud.action.consumer.feign;

import com.rainlf.springcloud.action.common.api.book.BookApi;

import java.util.concurrent.TimeUnit;

/**
 * @author : rain
 * @date : 2020/7/8 17:13
 */
public class FeignBookServiceFallback implements BookApi {

    @Override
    public String oneBook() {
        return "safe error";
    }


    @Override
    public String timeoutBook() throws InterruptedException {
        return "safe error";
    }
}

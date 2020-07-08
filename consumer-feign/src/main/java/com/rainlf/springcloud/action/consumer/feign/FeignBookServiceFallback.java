package com.rainlf.springcloud.action.consumer.feign;

import com.rainlf.springcloud.action.common.api.book.BookApi;

/**
 * @author : rain
 * @date : 2020/7/8 17:13
 */
public class FeignBookServiceFallback implements BookApi {

    @Override
    public String oneBook() {
        return "safe error";
    }
}

package com.rainlf.springcloud.action.consumer.feign;

import com.rainlf.springcloud.action.common.api.book.BookApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : rain
 * @date : 2020/7/8 17:13
 */
@FeignClient(contextId = "book", value = "COMMON-SERVICE", fallback = FeignBookServiceFallback.class)
public interface FeignBookService extends BookApi {

}

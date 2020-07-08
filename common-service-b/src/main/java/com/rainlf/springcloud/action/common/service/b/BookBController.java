package com.rainlf.springcloud.action.common.service.b;

import com.rainlf.springcloud.action.common.api.book.BookApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author : rain
 * @date : 2020/7/8 15:14
 */
@Slf4j
@RestController
public class BookBController implements BookApi {

    @Override
    public String oneBook() {
        return "I am a book from service B";
    }

    @Override
    public String timeoutBook() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        return "B";
    }
}

package com.rainlf.springcloud.action.common.service.a;

import com.rainlf.springcloud.action.common.api.book.BookApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : rain
 * @date : 2020/7/8 15:14
 */
@Slf4j
@RestController
public class BookAController implements BookApi {
    @Override
    public String oneBook() {
        return "I am a book from server A";
    }
}

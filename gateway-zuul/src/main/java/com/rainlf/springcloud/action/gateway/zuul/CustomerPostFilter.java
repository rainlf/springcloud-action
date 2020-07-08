package com.rainlf.springcloud.action.gateway.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StreamUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author : rain
 * @date : 2020/7/8 18:34
 */
@Slf4j
public class CustomerPostFilter extends ZuulFilter {

    /**
     * 过滤器类型，决定过滤器在请求的哪个声明周期中执行，分为：
     * pre: 请求被路由之前被调用
     * routing: 路由请求时被调用
     * post: routing 和 error 过滤器之后被调用
     * error: 发生错误时被调用
     */
    @Override
    public String filterType() {
        return "post";
    }

    /**
     * 过滤器顺序，越小越先执行
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否启用该过滤器
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器内容
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        try (InputStream in = context.getResponseDataStream()){
            String response = StreamUtils.copyToString(in, StandardCharsets.UTF_8);
            log.info("Post filter: {}", response);
            context.setResponseBody(response);
        }  catch (IOException e) {
            log.error("", e);
        }

        return null;
    }
}

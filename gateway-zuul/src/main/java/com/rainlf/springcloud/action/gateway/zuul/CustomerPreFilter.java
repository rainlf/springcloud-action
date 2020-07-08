package com.rainlf.springcloud.action.gateway.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : rain
 * @date : 2020/7/8 18:34
 */
@Slf4j
public class CustomerPreFilter extends ZuulFilter {

    /**
     * 过滤器类型，决定过滤器在请求的哪个声明周期中执行，分为：
     * pre: 请求被路由之前被调用
     * routing: 路由请求时被调用
     * post: routing 和 error 过滤器之后被调用
     * error: 发生错误时被调用
     */
    @Override
    public String filterType() {
        return "pre";
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
        return false;
    }

    /**
     * 过滤器内容
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();

        log.info("Method: {} {}", request.getMethod(), request.getRequestURL().toString());
        log.info("Parameters: {}", request.getParameterMap());

        String test = request.getParameter("drop");
        if ("1".equals(test)) {
            // 取消该请求的路由执行
            context.setSendZuulResponse(false);
            // 指定返回状态码
            context.setResponseStatusCode(401);
            return null;
        }

        return null;
    }
}

package com.li.nacos.filter;

import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class AuthFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //获取响应头信息
        String token = exchange.getRequest().getQueryParams().getFirst("token");
        if(StringUtils.isEmpty(token)){
            //返回状态码
            exchange.getResponse().setStatusCode(HttpStatus.NOT_FOUND);
            //return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        //执行顺序，数字越小优先级越高
        return 0;
    }
}

package com.li.nacos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用于测试nacos的controller测试
 */
@RestController
public class NacosController {

    @GetMapping("/testnacos")
    public String testNacos(){
        return "这是微服务的提供者，这是自己配置的nacos程序";
    }
}

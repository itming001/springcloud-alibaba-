package com.li.nacos.controller;

import com.li.nacos.fegin.NacosFegin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用于测试nacos的controller测试
 */
@RestController
public class NacosController {
    @Resource
    private NacosFegin nacosFegin;
    @GetMapping("/testnacos")
    public String testNacos(){
        String s = nacosFegin.nacosProvider();
        return s;
    }
}

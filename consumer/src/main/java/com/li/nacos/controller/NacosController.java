package com.li.nacos.controller;

import com.li.nacos.fegin.NacosFegin;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.MutablePropertySources;
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
    /**
     * 用来读取配置文件的类
     */
    @Resource
    private ConfigurableApplicationContext applicationContext;
    /**
     * 用来格式fegin接口的调用
     * @return
     */
    @GetMapping("/testnacos")
    public String testNacos(){
        String s = nacosFegin.nacosProvider();
        return s;
    }
    @GetMapping("/nacosConfig")
    public String testNacosFegin(){
        String userName = applicationContext.getEnvironment().getProperty("user.name");
        return userName;
    }

}

package com.li.nacos.fallback;

import com.li.nacos.fegin.NacosFegin;
import org.springframework.stereotype.Component;

@Component
public class NacosFallback implements NacosFegin {

    @Override
    public String nacosProvider() {
        return "网络错误，请检查你的网络是否正常";
    }
}

package com.li.nacos.fegin;

import com.li.nacos.fallback.NacosFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 创建fegin接口用于远程的调用
 */
//@FeginClient("填写微服务的名字")
@FeignClient(value = "nacos-provider",fallback = NacosFallback.class)
public interface NacosFegin  {
    //路径名称，方法的返回值都要和controller中的相对应
    @GetMapping("/testnacos")
    public String nacosProvider();
}

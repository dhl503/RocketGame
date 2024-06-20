package org.example.myrocket.controller;

//import com.alibaba.nacos.api.annotation.NacosProperties;
//import com.alibaba.nacos.api.config.annotation.NacosProperty;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.example.ice.GetDateService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
//@RefreshScope
//@NacosProperties
@RefreshScope
public class DemoController {

    @GetMapping("hello")
    public String hello() {
        return "hello dalu!!!!";
    }

    @Value("${useLocalCache.test:false}")
    private boolean useLocalCache;

    @Value("${test.n2:dada}")
    private String testNacosStr = "";

    @DubboReference
    private GetDateService dateservice;

    @GetMapping("/getConfig")
    public boolean get() {
        log.info("hello: {} -- {}", useLocalCache, testNacosStr);
        return useLocalCache;
    }

    @GetMapping("/getDateToday")
    public String getDateToday() {
        return dateservice.getdate();
    }

}

package org.example.myrocket;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.ice.HelloService;

@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}

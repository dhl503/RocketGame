package org.example.myrocket;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.ice.HelloService;

@DubboService(group = "aa")
public class HelloExImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Welcome " + name;
    }
}

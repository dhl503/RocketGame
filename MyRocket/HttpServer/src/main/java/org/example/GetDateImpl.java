package org.example;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.ice.GetDateService;

@DubboService
public class GetDateImpl implements GetDateService {
    @Override
    public String getdate() {
        return "2024.6.20";
    }
}

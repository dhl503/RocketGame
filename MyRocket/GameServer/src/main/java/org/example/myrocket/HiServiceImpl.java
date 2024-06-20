package org.example.myrocket;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.example.ice.TestService;
import org.example.bean.ServerInfo;

@Slf4j
@DubboService
public class HiServiceImpl implements TestService {
    @Override
    public String hha(int ss) {
        return "Hello world !!!";
    }

    @Override
    public void SyncServerInfo(ServerInfo info) {
        log.info(info.toString());
    }
}

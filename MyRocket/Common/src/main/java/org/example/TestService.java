package org.example;

import org.example.bean.ServerInfo;

//@FeignClient
public interface TestService {
    String hha(int ss);

    void SyncServerInfo(ServerInfo info);
}

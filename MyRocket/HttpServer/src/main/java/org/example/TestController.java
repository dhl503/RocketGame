package org.example;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.example.bean.ServerInfo;
import org.example.ice.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RefreshScope
public class TestController {

    @Autowired
    private RestTemplate restTemplatess;
    // public TestController(RestTemplate restTemplatess) {
    //     this.restTemplatess = restTemplatess;
    // }

    @DubboReference
    private TestService myservice;

    @Value("${test.n1}")
    private int mytestInt;

    @GetMapping("hello2")
    public String hello() {

        //myservice.hha(12);

        ServerInfo beasn = new ServerInfo();
        //beasn.setName("dalu");
        beasn.setPort(11);
        beasn.setServerId(12121);
        myservice.SyncServerInfo(beasn);

        log.info("recivei!! {}", mytestInt);

        //restTemplatess.getForObject("http://MyRocket/hha",Integer.class);
        return "hello dalu!!!!";
    }
}

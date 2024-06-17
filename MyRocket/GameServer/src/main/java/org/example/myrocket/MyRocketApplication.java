package org.example.myrocket;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

import java.io.IOException;
import java.sql.SQLException;

//@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
@EnableDubbo
public class MyRocketApplication {

    //@Autowired
    //private ApplicationContext context;

    public static void main(String[] args) throws IOException, SQLException {
        SpringApplication.run(MyRocketApplication.class, args);

        //MyComponent sk = SpringUtil.getBean(MyComponent.class);
        //sk.getResourceAbsolutePath();
        //ConnectMysqlTemplate template = SpringUtil.getBean(ConnectMysqlTemplate.class);
        //if (template != null) {
        //    template.TestSql();
        //}

        GameServer svr = SpringUtil.getBean(GameServer.class);
        if (svr != null) {
            svr.LoadConfigs();
            //svr.ConnectMysql();
            svr.Start();
            log.info("hello");
        }
    }

}

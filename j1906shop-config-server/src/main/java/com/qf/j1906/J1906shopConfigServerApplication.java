package com.qf.j1906;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer //启动配置中心服务
@EnableEurekaClient //将配置中心服务注册到注册中心
@SpringBootApplication
public class J1906shopConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1906shopConfigServerApplication.class, args);
    }

}

package com.qf.j1906;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients  //开启feign负载均衡
@EnableHystrix//开启熔断机制
@SpringCloudApplication
public class J1906shopAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1906shopAdminApplication.class, args);
    }

}

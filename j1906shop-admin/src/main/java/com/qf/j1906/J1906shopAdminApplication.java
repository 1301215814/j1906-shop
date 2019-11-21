package com.qf.j1906;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.qf.j1906"})
@EnableFeignClients(basePackages = {"com.qf.j1906.*.api"})  //开启feign负载均衡
//@EnableHystrix//开启熔断机制
@SpringCloudApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class J1906shopAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1906shopAdminApplication.class, args);
    }

}

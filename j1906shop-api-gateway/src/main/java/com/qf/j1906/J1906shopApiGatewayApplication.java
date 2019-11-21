package com.qf.j1906;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//@EnableHystrix  //熔断
@EnableZuulProxy  //开启zuul网关服务
@SpringCloudApplication //复合注解（包含@springBootAppLication、@EnableDiscoverClient、@EnableCircuitBreaker、、）
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class J1906shopApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1906shopApiGatewayApplication.class, args);
    }

}

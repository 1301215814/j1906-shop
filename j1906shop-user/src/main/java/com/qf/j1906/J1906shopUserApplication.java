package com.qf.j1906;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.qf.j1906"})
@SpringCloudApplication
public class J1906shopUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(J1906shopUserApplication.class, args);
    }

}

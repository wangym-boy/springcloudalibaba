package com.wym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrderMain90 {
    public static void main(String[] args) {
        SpringApplication.run(NacosOrderMain90.class,args);
    }
}

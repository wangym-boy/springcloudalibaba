package com.wym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain3333 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain3333.class,args);
    }
}

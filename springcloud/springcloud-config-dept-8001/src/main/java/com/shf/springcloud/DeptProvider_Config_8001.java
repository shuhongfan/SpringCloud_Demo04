package com.shf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient  //服务发现
@EnableEurekaClient
@SpringBootApplication  // 在服务中注册
public class DeptProvider_Config_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_Config_8001.class,args);
    }
}

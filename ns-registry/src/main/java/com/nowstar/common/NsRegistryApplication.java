package com.nowstar.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yinminxin
 * @description 注册中心启动类
 * @date 2020/5/21 16:03
 */
@SpringBootApplication
@EnableEurekaServer
public class NsRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(NsRegistryApplication.class, args);
    }
}

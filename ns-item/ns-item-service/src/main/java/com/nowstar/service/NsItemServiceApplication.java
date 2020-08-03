package com.nowstar.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yinminxin
 * @description 商品业务启动类
 * @date 2020/5/21 16:35
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NsItemServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(NsItemServiceApplication.class, args);
    }

}

package com.nowstar.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yinminxin
 * @description 上传服务启动类
 * @date 2020/5/22 15:07
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NsUploadApplication {
    public static void main(String[] args) {
        SpringApplication.run(NsUploadApplication.class, args);
    }
}

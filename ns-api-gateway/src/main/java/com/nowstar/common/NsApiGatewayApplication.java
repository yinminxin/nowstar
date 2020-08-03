package com.nowstar.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author yinminxin
 * @description 网关启动类
 * @date 2020/5/21 16:03
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class NsApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(NsApiGatewayApplication.class, args);
    }
}

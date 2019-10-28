package com.poc.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Created by ace on 2017/7/29.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
@EnableSwagger2Doc
@MapperScan("com.poc.demo.mapper")
public class PocOrderApp {
    public static void main(String[] args) {
        SpringApplication.run(PocOrderApp.class, args);
    }
}

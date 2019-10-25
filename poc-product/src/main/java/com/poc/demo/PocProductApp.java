package com.poc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring4all.swagger.EnableSwagger2Doc;


/**
 * ${DESCRIPTION}
 *
 * @author demo
 * @create 2017-10-22 20:30
 */
@SpringBootApplication
//@EnableDiscoveryClient
@EnableSwagger2Doc
//@RefreshScope
public class PocProductApp{
	
    public static void main(String[] args) {
        SpringApplication.run(PocProductApp.class, args);
    }
    
//    @LoadBalanced
//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
}

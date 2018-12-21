package com.mmc.spring.boot.base.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @packageName：com.mmc.spring.boot.base.server
 * @desrciption:
 * @author: gaowei
 * @date： 2018-12-21 10:01
 * @history: (version) author date desc
 */
@SpringBootApplication(scanBasePackages = "com.mmc.spring.boot.base")
@EnableEurekaClient
public class SpringBootRunServer{

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRunServer.class, args);
    }


}

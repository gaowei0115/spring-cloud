package com.mmc.spring.boot.cloud.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @packageName：com.mmc.spring.boot.cloud.register
 * @desrciption:
 * @author: gaowei
 * @date： 2018-12-21 15:26
 * @history: (version) author date desc
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaRegisterStart {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRegisterStart.class, args);
    }
}

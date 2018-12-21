package com.mmc.spring.boot.dubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @packageName：com.mmc.spring.boot.dubbo
 * @desrciption:
 * @author: gaowei
 * @date： 2018-12-21 17:31
 * @history: (version) author date desc
 */
@SpringBootApplication
@EnableDubboConfiguration
public class DubboStart {

    public static void main(String[] args) {
        SpringApplication.run(DubboStart.class, args);
    }
}

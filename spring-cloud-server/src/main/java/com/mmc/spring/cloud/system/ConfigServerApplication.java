package com.mmc.spring.cloud.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @packageName：com.mmc.spring.cloud.system
 * @desrciption: spirng cloud config配置启动主类
 * @author: gaowei
 * @date： 2018-01-02 16:30
 * @history: (version) author date desc
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    /**
     * 启动入口
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}

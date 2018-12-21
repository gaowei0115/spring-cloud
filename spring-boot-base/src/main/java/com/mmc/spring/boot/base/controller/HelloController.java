package com.mmc.spring.boot.base.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @packageName：com.mmc.spring.boot.base.controller
 * @desrciption:
 * @author: gaowei
 * @date： 2018-12-21 13:59
 * @history: (version) author date desc
 */
@RestController
@RequestMapping("/i")
public class HelloController {

    @Value("${server.port}")
    private String port;

    @Value("${server.servlet.context-path}")
    private String servletContext;

    @RequestMapping("/context")
    public String context() {
        return servletContext;
    }

    @RequestMapping("/port")
    public String port() {
        return port;
    }

    @RequestMapping("hello")
    public String hello() {
        return "hello Spring boot";
    }

}

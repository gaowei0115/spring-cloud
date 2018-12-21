package com.mmc.spring.boot.base.config;

import com.mmc.spring.boot.base.interceptor.ApiInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @packageName：com.mmc.spring.boot.base.config
 * @desrciption: 拦截器配置
 * @author: gaowei
 * @date： 2018-12-21 13:51
 * @history: (version) author date desc
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer{


    @Bean
    public ApiInterceptor apiInterceptor() {
        return new ApiInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /**
         * 添加注册注解
         */
        registry.addInterceptor(apiInterceptor());
    }
}

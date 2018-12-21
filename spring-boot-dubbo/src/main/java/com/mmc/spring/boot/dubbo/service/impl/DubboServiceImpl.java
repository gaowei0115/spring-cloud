package com.mmc.spring.boot.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mmc.spring.boot.dubbo.service.IDubboService;
import org.springframework.stereotype.Component;

/**
 * @packageName：com.mmc.spring.boot.dubbo.service.impl
 * @desrciption:
 * @author: gaowei
 * @date： 2018-12-21 17:33
 * @history: (version) author date desc
 */
@Component
@Service(interfaceClass = IDubboService.class)
public class DubboServiceImpl implements IDubboService {

    @Override
    public String sayHello(String name) {
        return "say " + name + " dubbo !";
    }
}

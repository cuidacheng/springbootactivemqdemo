/**
 * Copyright (C) 2006-2019 Tuniu All rights reserved
 */
package com.boot.activemqdemo.service.impl;

import com.boot.activemqdemo.service.IActiveMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class ActiveMqServiceImpl implements IActiveMqService {

    @Autowired
    JmsTemplate jmsTemplate;

    @Override
    public String publishMsg(String msg) {
        System.out.println("发送消息");
        jmsTemplate.setDefaultDestinationName("cdc-default-destination-name");
        jmsTemplate.convertAndSend(msg);
        return msg;
    }

    @Override
    @JmsListener(destination = "cdc-default-destination-name")
    public void subscribeMsg(String msg) {
        System.out.println("接受消息：" + msg);
    }
}

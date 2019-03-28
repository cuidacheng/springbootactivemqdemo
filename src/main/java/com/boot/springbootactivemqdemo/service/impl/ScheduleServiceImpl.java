/**
 * Copyright (C) 2006-2019 Tuniu All rights reserved
 */
package com.boot.springbootactivemqdemo.service.impl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleServiceImpl {

    int count1 = 1;
    int count2 = 1;

    @Scheduled(fixedRate = 1000)
    @Async
    public void job1() {
        System.out.println("[" + Thread.currentThread().getName() + "] [job1]执行次数，执行第" + "【 "+ count1 +"】" + "[job1]");
        count1++;
    }

    @Scheduled(fixedRate = 1000)
    @Async
    public void job2() {
        System.out.println("[" + Thread.currentThread().getName() + "] [job2]执行次数，执行第" + "【 "+ count1 +"】" + "[job2]");
        count2++;
    }
}

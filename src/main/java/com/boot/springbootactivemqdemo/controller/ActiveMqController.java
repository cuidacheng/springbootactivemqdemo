/**
 * Copyright (C) 2006-2019 Tuniu All rights reserved
 */
package com.boot.springbootactivemqdemo.controller;

import com.boot.springbootactivemqdemo.service.IActiveMqService;
import com.boot.springbootactivemqdemo.vo.MsgVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/activeMq")
public class ActiveMqController {
    @Autowired
    private IActiveMqService activeMqService = null;

    @RequestMapping("/publishMsg")
    public Map<String, Object> publishMsg(@RequestBody MsgVO msgVO) {
        if (msgVO == null || msgVO.getMessage().isEmpty()) {
            return result(false, null);
        }
        String msg = activeMqService.publishMsg(msgVO.getMessage());
        return result(true, msg);
    }




    private Map<String, Object> result(Boolean success, Object message) {
        Map<String, Object> result = new HashMap<>();
        result.put("success", success);
        result.put("message", message);
        return result;
    }
}

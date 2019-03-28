/**
 * Copyright (C) 2006-2019 Tuniu All rights reserved
 */
package com.boot.activemqdemo.vo;

import java.io.Serializable;

/**
 * TODO: description
 * Date: 2019-03-27
 *
 * @author cuidc
 */
public class MsgVO implements Serializable{
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

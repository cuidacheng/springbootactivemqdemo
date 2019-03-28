/**
 * Copyright (C) 2006-2019 Tuniu All rights reserved
 */
package com.boot.springbootactivemqdemo.service;

/**
 * TODO: description
 * Date: 2019-03-27
 *
 * @author cuidc
 */
public interface IActiveMqService {

    String publishMsg(String msg);

    void subscribeMsg(String msg);
}

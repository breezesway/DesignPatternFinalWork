package com.cgz.handler;

import com.cgz.bean.Slip;
import com.cgz.context.HandlerContext;

public interface Handler {
    void channelProcess(HandlerContext handlerContext, Slip slip);
}

package com.cgz.context;

import com.cgz.bean.Slip;
import com.cgz.handler.Handler;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Pipeline {
    public BlockingDeque<HandlerContext> handlerContexts = new LinkedBlockingDeque<>();

    public Pipeline(){
    }

    public void addHandlerContext(Handler handler){
        HandlerContext nowHandlerContext=new HandlerContext(handler);
        if(!handlerContexts.isEmpty()){
            HandlerContext lastHandlerContext = handlerContexts.getLast();
            lastHandlerContext.setNextHandlerContext(nowHandlerContext);
        }
        handlerContexts.addLast(nowHandlerContext);
    }

    public void Request(Slip slip){
        handlerContexts.getFirst().doWork(slip);
    }

}

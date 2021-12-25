package com.cgz.context;

import com.cgz.bean.Slip;
import com.cgz.handler.Handler;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HandlerContext {
    private Handler handler;
    private HandlerContext nextHandlerContext;//下一个context的引用
    public ExecutorService executor= Executors.newSingleThreadExecutor();
    //public ExecutorService executor= Executors.newFixedThreadPool(3);

    public HandlerContext(Handler handler){
        this.handler=handler;
    }

    public HandlerContext getNextHandlerContext() {
        return nextHandlerContext;
    }

    public void setNextHandlerContext(HandlerContext nextHandlerContext) {
        this.nextHandlerContext = nextHandlerContext;
    }

    public void doWork(Slip slip) {//执行任务的时候向线程池提交一个runnable的任务，任务中调用handler
        executor.submit(() -> {
            handler.channelProcess(this, slip);
        });
    }

    public void doNext(Slip slip){
        nextHandlerContext.doWork(slip);
    }
}

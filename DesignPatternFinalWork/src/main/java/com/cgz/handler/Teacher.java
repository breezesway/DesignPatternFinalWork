package com.cgz.handler;

import com.cgz.bean.Slip;
import com.cgz.context.HandlerContext;

public class Teacher implements Handler{

    @Override
    public void channelProcess(HandlerContext handlerContext, Slip slip) {
        //System.out.println(Thread.currentThread().getName());
        if(slip.getLeaveDays()<=3){
            System.out.println(slip.getStudentName()+"的请假天数是"+slip.getLeaveDays()+"天,由Teacher批准了");
            return;
        }
        if(handlerContext.getNextHandlerContext()!=null){
            handlerContext.doNext(slip);
        }
    }
}

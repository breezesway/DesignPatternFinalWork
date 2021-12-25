package com.cgz.controller;

import com.cgz.bean.Book;
import com.cgz.bean.CCNU;
import com.cgz.bean.Examination;
import com.cgz.bean.Slip;
import com.cgz.context.Pipeline;
import com.cgz.exam.ExaminationSchedule;
import com.cgz.exam.Iterator;
import com.cgz.handler.*;
import com.cgz.library.Librarian;
import com.cgz.reservation.ClasssroomUser;
import com.cgz.strategy.ClassroomRepair;
import com.cgz.strategy.Context;
import com.cgz.strategy.DormitoryRepair;
import com.cgz.strategy.LaboratoryRepair;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class Controller {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/permission/{num}")
    public String permissionRequest(@PathVariable("num") int num){
        Pipeline pipeline=new Pipeline();
        pipeline.addHandlerContext(new Monitor());
        pipeline.addHandlerContext(new Teacher());
        pipeline.addHandlerContext(new Dean());
        pipeline.addHandlerContext(new Headmaster());

        Random random = new Random();
        for (int i=0;i<num;i++){
            pipeline.Request(new Slip("Student"+i, random.nextInt(10)));
        }
        return "success";
    }

    @RequestMapping("/repair/{type}")
    public String repairRequest(@PathVariable("type") String type){
        Context context = new Context();
        if("教室".equals(type)){
            context.setStrategy(new ClassroomRepair());
        }else if("实验室".equals(type)){
            context.setStrategy(new LaboratoryRepair());
        }else {
            context.setStrategy(new DormitoryRepair());
        }
        return context.executeStrategy();
    }

    @RequestMapping("/reservation")
    public List<String> reservationClassroom(){
        ArrayList<String> list = new ArrayList<>();
        ClasssroomUser user = new ClasssroomUser();
        list.add(user.activity());
        list.add(user.attendClass());
        list.add(user.meeting());
        return list;
    }

    @RequestMapping("/queryExam")
    public List<String> queryExaminationSchedule(){
        ArrayList<String> list = new ArrayList<>();
        ExaminationSchedule examinationSchedule = new ExaminationSchedule();
        Iterator iterator = examinationSchedule.getIterator();
        while (iterator.hasNext()){
            list.add(iterator.next().toString());
        }
        return list;
    }

    @RequestMapping("/querySchool")
    public String querySchool(){
        CCNU ccnu = new CCNU();
        return ccnu.toString();
    }

    @RequestMapping("/borrowBook/{bookName}")
    public Book borrowBook(@PathVariable("bookName") String bookName) throws CloneNotSupportedException {
        Librarian librarian = new Librarian();
        return librarian.borrowBook(bookName);
    }
}

package com.cgz.reservation;

public class ClasssroomUser {

    private Purpose activity;
    private Purpose attendClass;
    private Purpose meeting;

    public ClasssroomUser(){
        activity = new Activity();
        attendClass = new AttendClass();
        meeting = new Meeting();
    }

    public String activity(){
        return activity.use();
    }

    public String attendClass(){
        return attendClass.use();
    }

    public String meeting(){
        return meeting.use();
    }

}

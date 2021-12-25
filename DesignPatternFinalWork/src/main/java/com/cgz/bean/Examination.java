package com.cgz.bean;

import java.util.Date;

public class Examination {

    String name;
    Date date;
    String place;

    public Examination(String name, Date date, String place) {
        this.name = name;
        this.date = date;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Examination{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", place='" + place + '\'' +
                '}';
    }
}

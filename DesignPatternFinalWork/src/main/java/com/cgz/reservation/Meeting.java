package com.cgz.reservation;

public class Meeting implements Purpose{
    @Override
    public String use() {
        return "使用这个教室开会";
    }
}

package com.cgz.exam;

import com.cgz.bean.Examination;

import java.util.Date;

public class ExaminationSchedule implements Schedule{

    private Examination[] examinations;

    public ExaminationSchedule(){
        examinations = new Examination[]{
                new Examination("数据结构",new Date(),"N530"),
                new Examination("高等数学",new Date(),"N528"),
                new Examination("操作系统",new Date(),"N426"),
                new Examination("数据库",new Date(),"N123"),
                new Examination("软件工程",new Date(),"N321"),
                new Examination("设计模式",new Date(),"N410")
        };
    }

    @Override
    public Iterator getIterator() {
        return new ExaminationIterator();
    }

    private class ExaminationIterator implements Iterator{

        int index=0;

        @Override
        public boolean hasNext() {
            return index < examinations.length;
        }

        @Override
        public Examination next() {
            if ((this.hasNext())){
                return examinations[index++];
            }
            return null;
        }
    }
}

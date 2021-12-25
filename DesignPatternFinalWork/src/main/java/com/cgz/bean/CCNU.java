package com.cgz.bean;

public class CCNU {
    private Department department;

    public CCNU() {
       department = new Department("CCNU");
        Department c = new Department("计算机学院");
        Department ai = new Department("人工智能学部");
        Department cs = new Department("计算机科学与技术系");
        Department se = new Department("软件工程系");
        Department is = new Department("信息安全系");
        Department iot = new Department("物联网工程系");
        Department cs2 = new Department("计算机科学与技术");
        Department tt = new Department("教育技术学");
        c.addsub(cs);
        c.addsub(se);
        c.addsub(is);
        c.addsub(iot);
        ai.addsub(cs2);
        ai.addsub(tt);
        department.addsub(c);
        department.addsub(ai);
    }

    @Override
    public String toString() {
        return department.toString();
    }
}

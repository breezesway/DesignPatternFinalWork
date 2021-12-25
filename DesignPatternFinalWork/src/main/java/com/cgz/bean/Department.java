package com.cgz.bean;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private List<Department> subordinates;

    public Department(String name) {
        this.name = name;
        subordinates = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getSubordinates() {
        return subordinates;
    }

    public void addsub(Department d){
        subordinates.add(d);
    }

    @Override
    public String toString() {
        return name+":\n"+subordinates.toString();
    }
}

package com.cgz.bean;

public class Slip {
    private String studentName;
    private int leaveDays;

    public Slip(String studentName, int leaveDays) {
        this.studentName = studentName;
        this.leaveDays = leaveDays;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    @Override
    public String toString() {
        return "PermissionSlip{" +
                "studentName='" + studentName + '\'' +
                ", leaveDays=" + leaveDays +
                '}';
    }
}

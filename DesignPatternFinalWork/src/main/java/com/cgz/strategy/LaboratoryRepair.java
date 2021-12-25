package com.cgz.strategy;

public class LaboratoryRepair implements Strategy{
    @Override
    public String Repair() {
        return "开始执行实验室报修流程...";
    }
}

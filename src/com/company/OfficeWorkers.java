package com.company;

import java.util.Random;

public class OfficeWorkers extends Employee {
    private SeniorityLevel seniority;

    public OfficeWorkers(String name, String groupName) {
        super(name, groupName);
        this.seniority = getSeniority();
        this.monthlySalary = paySalary();
    }

    private int paySalary() {
        if(this.seniority == SeniorityLevel.JUNIOR){
            return 1250;
        }else{
            return 1700;
        }
    }

    public SeniorityLevel getSeniority() {
        if(RandomBooleanValue.randomBooleanValue()){
            return SeniorityLevel.JUNIOR;
        }
        return SeniorityLevel.SENIOR;
    }

}

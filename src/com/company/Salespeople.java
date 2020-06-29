package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Salespeople extends Employee {
    public Salespeople(String name, String groupName) {
        super(name, groupName);
        this.monthlySalary = ThreadLocalRandom.current().nextInt(1500, 2000);
    }

    public int getMonthlySalary(){
        this.monthlySalary = ThreadLocalRandom.current().nextInt(1500, 2000);
        return this.monthlySalary;
    }

}

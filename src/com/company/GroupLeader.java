package com.company;

public class GroupLeader extends Employee {

    public GroupLeader(String name, String groupName) {        super(name, groupName); }

    public void paySalary(int numberOfEmployeesInGroup) {
        this.monthlySalary = 1800 + 200*numberOfEmployeesInGroup;
    }

}

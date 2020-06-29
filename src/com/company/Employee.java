package com.company;

public abstract class Employee {
    public int id;
    public static int countId;
    public String name;
    public String groupName;
    public int monthlySalary;

    public Employee(String name, String groupName) {
        countId++;
        this.id = countId;
        this.name = name;
        this.groupName = groupName;
    }

    public String getName() {
        return name;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}'+"\n";
    }
}

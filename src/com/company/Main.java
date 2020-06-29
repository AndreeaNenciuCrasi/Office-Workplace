package com.company;

public class Main {

    public static void main(String[] args) {

        Salespeople salesman1 = new Salespeople("Tom", "TEAM SALES 1");
        Salespeople salesman2 = new Salespeople("Tim", "TEAM SALES 1");
        Salespeople salesman3 = new Salespeople("Bob", "TEAM SALES 1");

        OfficeWorkers officeWorker1 = new OfficeWorkers("Kim", "Team Office 2");
        OfficeWorkers officeWorker2 = new OfficeWorkers("Clara", "Team Office 2");
        OfficeWorkers officeWorker3 = new OfficeWorkers("Caruso", "Team Office 2");
        OfficeWorkers officeWorker4 = new OfficeWorkers("Colin", "Team Office 2");
        OfficeWorkers officeWorker5 = new OfficeWorkers("Sue", "Team Office 2");

        GroupLeader groupLeader1 = new GroupLeader("Andrew", "TEAM SALES 1");
        GroupLeader groupLeader2 = new GroupLeader("Meg", "Team Office 3");


        Group group1 = new Group("TEAM SALES 1", groupLeader1, "Sales");
        Group group2 = new Group("Team Office 2", groupLeader2, "Office");


        group1.addEmployeeToGroup(salesman1);
        group1.addEmployeeToGroup(salesman2);
        group1.addEmployeeToGroup(salesman3);
        System.out.println("*********************************************");
        System.out.println("Group name: " + group1.getName());

        for (int i = 0; i < 12; i++) {
            System.out.println("Month " + (i+1));
            groupLeader1.paySalary(group1.getEmployees().size());
            System.out.println("Leader " + groupLeader1.getName() + " earns " + groupLeader1.getMonthlySalary());
            for(Employee employee: group1.getEmployees()){
                System.out.println("Employee " + employee.getName() + " earns " + employee.getMonthlySalary());
            }
            System.out.println();
        }

        group2.addEmployeeToGroup(officeWorker1);
        group2.addEmployeeToGroup(officeWorker2);
        group2.addEmployeeToGroup(officeWorker3);
        group2.addEmployeeToGroup(officeWorker4);
        group2.addEmployeeToGroup(officeWorker5);
        System.out.println("*********************************************");
        System.out.println("Group name: " + group2.getName());
        for (int i = 0; i < 12; i++) {
            System.out.println("Month " + (i+1));
            groupLeader2.paySalary(group2.getEmployees().size());
            System.out.println("Leader " + groupLeader2.getName() + " earns " + groupLeader2.getMonthlySalary());
            for(Employee employee: group2.getEmployees()){
                System.out.println("Employee " + employee.getName() + " earns " + employee.getMonthlySalary());
            }
            System.out.println();
        }

    }
}

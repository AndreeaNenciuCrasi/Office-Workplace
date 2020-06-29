package com.company;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class Group {
    private int id;
    private static int countId;
    private String name;
    private GroupLeader groupLeader;
    private List<Employee> employees;
    private String groupType;

    public Group(String name, GroupLeader groupLeader, String groupType) {
        countId++;
        this.id=countId;
        this.name = name;
        this.groupLeader = groupLeader;
        this.groupType = groupType;
        this.employees = new ArrayList<>();

    }

    public boolean addEmployeeToGroup(Employee employee){
        if(employee != null){
            employees.add(employee);
            return true;
        }
        return false;
    }


    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }


    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                "\n, groupLeader=" + groupLeader +
                "\n, employees=" + employees +
                '}';
    }
}

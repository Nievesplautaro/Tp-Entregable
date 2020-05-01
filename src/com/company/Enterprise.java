package com.company;

import com.company.construction.Construction;
import com.company.employees.Employee;

import java.util.List;

public class Enterprise {
    private String name;
    private List<Employee> employees;
    private List<Construction> constructions;

    public Enterprise(String name, List<Employee> employees, List<Construction> constructions) {
        this.name = name;
        this.employees = employees;
        this.constructions = constructions;
    }
    public void printEnterprise(){
        System.out.println(name+"\n"+employees+"\n"+constructions);
    }
}

package com.company;

import com.company.construction.Construction;
import com.company.employees.Employee;

import java.util.Iterator;
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

    public String getName(){
        return this.name;
    }

    public void printEnterprise(){
        System.out.println("\n"+name+"\nData");
        this.printConstructionsByEnterprise();
        this.printEmployeesByEnterprise();
    }

    public  void addConstrucctions(Construction newest){
       this.constructions.add(newest);
    }

    public void addEmployee(Employee newest){
        this.employees.add(newest);
    }

    public void printConstructionsByEnterprise(){
        Iterator var =this.constructions.iterator();

        System.out.println("Construcctions by "+this.getName());

        while(var.hasNext()){
            Construction construction = (Construction) var.next();
            construction.printConstruction();
        }
    }

    public void printEmployeesByEnterprise(){
        Iterator var =this.employees.iterator();

        System.out.println("Employees by "+this.getName());

        while(var.hasNext()){
            Employee employee = (Employee) var.next();
            employee.printEmployee();
        }
    }
}

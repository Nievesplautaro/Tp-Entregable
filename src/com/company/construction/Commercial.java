package com.company.construction;

import com.company.employees.Employee;

import java.util.List;

public class Commercial extends Construction {
    private String name;

    public Commercial(String adress, double area, int days, double costPerMeter, List<Employee> employees, String name) {
        super(adress, area, days, costPerMeter, employees);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void printConstruction() {
        super.printConstruction();
        System.out.println("Name:"+this.getName());
    }


}

package com.company.construction;

import com.company.employees.Employee;

import java.util.List;

public class Commerce extends Commercial{
    private String item;


    public Commerce(String adress, double area, int days, double costPerMeter, List<Employee> employees, String name, String item) {
        super(adress, area, days, costPerMeter, employees, name);
        this.item=item;
    }
}

package com.company.construction;

import com.company.employees.Employee;
import com.company.employees.Architect;
import com.company.employees.MasterBuilder;
import com.company.employees.Worker;

import java.util.List;

public class Domestics extends Construction {
    private int rooms;

    public Domestics(String adress, double area, int days, double costPerMeter, List<Employee> employees, int rooms) {
        super(adress,area,days,costPerMeter,employees);
        this.rooms = rooms;
    }
}

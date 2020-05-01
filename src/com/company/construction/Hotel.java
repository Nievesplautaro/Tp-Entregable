package com.company.construction;

import com.company.employees.Employee;

import java.util.List;

public class Hotel extends Commercial{
    private int floors;

    public Hotel (String adress, double area, int days, double costPerMeter, List<Employee> employees, String name,int floors) {
        super(adress,area,days,costPerMeter,employees,name);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    @Override
    public void printConstruction() {
        super.printConstruction();
        System.out.println("Floors: "+this.getFloors()+"\n_______________");
    }
}

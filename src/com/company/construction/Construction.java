package com.company.construction;
import com.company.employees.Employee;



import java.util.List;


public class Construction {
    private String adress;
    private double area;
    private int days;
    private double costPerMeter;
    private List<Employee> employees;

    public Construction(){

    }

    public Construction(String adress, double area, int days, double costPerMeter, List<Employee> employees) {
        this.adress = adress;
        this.area = area;
        this.days = days;
        this.costPerMeter = costPerMeter;
        this.employees = employees;
    }

}

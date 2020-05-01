package com.company.employees;

public class Employee {
    private String name;
    private String lastname;
    private int dni;
    private String phone;
    private double salary;

    public Employee(){

    }

    public Employee(String name, String lastname, int dni, String phone) {
        this.name = name;
        this.lastname = lastname;
        this.dni = dni;
        this.phone = phone;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }
}

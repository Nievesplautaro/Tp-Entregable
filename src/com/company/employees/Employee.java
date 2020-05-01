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

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void printEmployee(){
        System.out.println ("Employee Data\nName:"+this.getName()+"\nLastname:"+this.getLastname()+"\nDNI:"+this.getDni()+"\nPhone:"+this.getPhone()+"\nSalary:"+this.getSalary());
    }
}

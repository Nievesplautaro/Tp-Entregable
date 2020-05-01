package com.company.employees;

public class Worker extends Employee {
    private int age;


    public Worker(String name, String lastname, int dni, String phone,int age) {
        super(name, lastname, dni, phone);
        this.age = age;
        super.setSalary(1500);
    }

    public void Build (){
        System.out.println("im a worker and im working");
    }
}

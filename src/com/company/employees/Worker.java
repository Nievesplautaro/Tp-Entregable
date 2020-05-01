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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void printEmployee() {
        super.printEmployee();
        System.out.println("Age:"+ this.getAge()+"\n_________________");
    }
}

package com.company.employees;

public class MasterBuilder extends Employee {
    private int edad;

    public MasterBuilder(String name, String lastname, int dni, String phone,int edad) {
        super(name, lastname, dni, phone);
        this.edad = edad;
        super.setSalary(1800);
    }

    public void Build (){
        System.out.println("im a master and i supervise the constructions");
    }

}

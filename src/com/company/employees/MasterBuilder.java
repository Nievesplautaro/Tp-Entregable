package com.company.employees;

public class MasterBuilder extends Employee {
    private int age;

    public MasterBuilder(String name, String lastname, int dni, String phone,int age) {
        super(name, lastname, dni, phone);
        this.age = age;
        super.setSalary(1800);
    }

    public void Build (){
        System.out.println("im a master and i supervise the constructions");
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

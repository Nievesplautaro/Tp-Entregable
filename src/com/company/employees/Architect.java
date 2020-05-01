package com.company.employees;

public class Architect  extends Employee{
    private int enrollment;


    public Architect(String name, String lastname, int dni, String phone, int enrollment) {
        super(name, lastname, dni, phone);
        this.enrollment = enrollment;
        super.setSalary(2000);
    }

    public void MakeBlueprints(){
        System.out.println("im making my next blueprint");
    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    @Override
    public void printEmployee() {
        super.printEmployee();
        System.out.println("Enrollment:"+ this.getEnrollment()+"\n_________________");
    }
}

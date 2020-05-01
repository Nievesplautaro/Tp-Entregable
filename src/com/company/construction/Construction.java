package com.company.construction;
import com.company.employees.Employee;
import com.company.employees.Architect;
import com.company.employees.MasterBuilder;
import com.company.employees.Worker;


import java.util.List;
import java.util.Iterator;



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

    public void AddToConstruccion (Employee newEmployee){
        //Conteo de arquitectos
        if (newEmployee instanceof Architect){
            if(this.architechCounter()==0){
                this.employees.add(newEmployee);
            }
            else{
                System.out.println("This construccion had too much architects");
            }
        }
        //Conteo Maestros
        if (newEmployee instanceof MasterBuilder){
            if(this.masterCounter()<=3){
                this.employees.add(newEmployee);
            }
            else{
                System.out.println("This construccion had too much Master Builders");
            }
        }
        //Add Peones (no hay conteo)
        if (newEmployee instanceof Worker){
                this.employees.add(newEmployee);
        }
    }

    //contador arquitectos
    public int architechCounter(){
        int value = 0;
        Iterator var = this.employees.iterator();

        while (var.hasNext()){
            //recorro
            Employee employee = (Employee)var.next();
            //conteo
            if (employee instanceof Architect){
                value++;
            }
        }

        return value;
    }

    //contador maestros
    public int masterCounter(){
        int value = 0;
        Iterator var = this.employees.iterator();

        while (var.hasNext()){
            //recorro
            Employee employee = (Employee)var.next();
            //conteo
            if (employee instanceof MasterBuilder){
                value++;
            }
        }

        return value;
    }

    //contador peones
    public int workerCounter(){
        int value = 0;
        Iterator var = this.employees.iterator();

        while (var.hasNext()){
            //recorro
            Employee employee = (Employee)var.next();
            //conteo
            if (employee instanceof Worker){
                value++;
            }
        }

        return value;
    }


    public double getEstimatedCost(){
        double finalCost = 0;
        double dailyCost= 0;

        //chequeo de parametros para calcular
        if (this.architechCounter()!=1){
            System.out.println("Imposible to calculate for "+this.getAdress()+". Its need only 1 architecht to get the cost");
        }
        else{
            if ( this.masterCounter() <= 3 && this.masterCounter()>= 1 ){
                    if (this.workerCounter() < 2){
                        System.out.println("Imposible to calculate for "+this.getAdress()+". Its need 2 workers to get the cost");
                    }
                    //superados los filtros se calcula costo
                    else{
                        Employee employee;
                        for (Iterator  var = this.employees.iterator(); var.hasNext(); dailyCost += employee.getSalary()){
                            employee = (Employee)var.next();
                        }
                     finalCost = this.area*this.costPerMeter + dailyCost * (double)this.days;
                    }
            }
            else{
                System.out.println("Imposible to calculate for "+this.getAdress()+". Its need between 3 and 1 Master Builders to get the cost");
            }
        }
        return finalCost;
    }

    public String getAdress() {
        return adress;
    }

    public double getArea() {
        return area;
    }

    public int getDays() {
        return days;
    }


    public double getCostPerMeter() {
        return costPerMeter;
    }


    public void printConstruction(){
       System.out.println ("Construcction Data\nAdress:"+this.getAdress()+"\nArea:"+this.getArea()+"\nWork Days:"+this.getDays()+"\nCost Per Meter:"+this.getCostPerMeter()+"\nEstimated Cost:"+this.getEstimatedCost());
    }

    public void printEmployeesByConstrucction(){
        Iterator var =this.employees.iterator();

        System.out.println("Employees for Construction "+this.getAdress());

        while(var.hasNext()){
            Employee employee = (Employee)var.next();
            employee.printEmployee();
        }
    }

}

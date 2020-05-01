package com.company;

import com.company.construction.Construction;
import com.company.construction.Domestics;
import com.company.construction.Hotel;
import com.company.employees.Architect;
import com.company.employees.Employee;
import com.company.employees.MasterBuilder;
import com.company.employees.Worker;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	//punto 2-A
        Worker workerA = new Worker("Charles","Darwim",123456,"55598745",65);
        MasterBuilder masterA = new MasterBuilder("jose","chavez",456789,"55547895",33);
        Architect architectA = new Architect("Rigoberto","Gonzalez",123457,"47859665",12348);
        workerA.Build();
        masterA.Build();
        architectA.MakeBlueprints();
    //punto 2-B
        List<Employee> employeesFrijolitos = new ArrayList<>();
        employeesFrijolitos.add(workerA);
        employeesFrijolitos.add(masterA);
        employeesFrijolitos.add(architectA);
        List<Construction>constructionsFrijolito = new ArrayList<>();
        Hotel hotelA = new Hotel("Wallaby 42",23,25,5.50,employeesFrijolitos,"Fatsa Hotel",12);
        Domestics domesticA = new Domestics("P. Sherman 42",15,15,3.30,employeesFrijolitos,3);
        constructionsFrijolito.add(hotelA);
        constructionsFrijolito.add(domesticA);

        Enterprise enterpriseA = new Enterprise ("Frijolitos S.A",employeesFrijolitos,constructionsFrijolito);
        enterpriseA.printEnterprise();

    //punto 2-C
        
    }
}

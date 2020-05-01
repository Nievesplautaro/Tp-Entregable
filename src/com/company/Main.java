package com.company;

import com.company.construction.Commerce;
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
        System.out.println("PUNTO 2 A \n");
        Worker workerA = new Worker("Charles","Darwim",123456,"55598745",65);
        MasterBuilder masterA = new MasterBuilder("jose","chavez",456789,"55547895",33);
        Architect architectA = new Architect("Rigoberto","Gonzalez",123457,"47859665",12348);
        workerA.Build();
        masterA.Build();
        architectA.MakeBlueprints();
    //punto 2-B
        System.out.println("PUNTO 2 B \n");
        List<Employee> employeesFrijolitos = new ArrayList<>();
        //metodo uno para agregar empleados a Empresa
        employeesFrijolitos.add(workerA);
        employeesFrijolitos.add(masterA);
        employeesFrijolitos.add(architectA);
        List<Construction>constructionsFrijolito = new ArrayList<>();
        Hotel hotelA = new Hotel("Wallaby 42",23,25,5.50,employeesFrijolitos,"Fatsa Hotel",12);
        Domestics domesticA = new Domestics("P. Sherman 42",15,15,3.30,employeesFrijolitos,3);
        //metodo uno para agregar construcciones a Empresa
        constructionsFrijolito.add(hotelA);
        constructionsFrijolito.add(domesticA);

        Enterprise enterpriseA = new Enterprise ("Frijolitos S.A",employeesFrijolitos,constructionsFrijolito);
        //printea lista de empleados y construcciones desde la empresa
        enterpriseA.printEnterprise();

    //punto 2-C
        System.out.println("PUNTO 2 C \n");
        List<Employee> employeesTamales = new ArrayList<>();

        MasterBuilder masterB = new MasterBuilder("Luisito","Taquero",1478526,"555-33-TAMAL",43);
        Worker workerC = new Worker("Arnaldo","YaWey",78794512,"555-78-4132",36);

        employeesTamales.add(workerC);
        employeesTamales.add(masterA);
        employeesTamales.add(masterB);
        employeesTamales.add(workerA);
        employeesTamales.add(architectA);

        //tipos de obras instanciados
        Domestics domesticB = new Domestics("La neta 4578",12.6,7,3.24,employeesTamales,4);
        Hotel hotelB = new Hotel("Carnal 4169",56.4,12,4.56,employeesTamales,"Hotel No Mames Carnal",16);
        //paso empleados de Friolitos para chequear que sucede cuandoo no tiene los parametros suficientes para calcular el precio
        Commerce commerceB = new Commerce("Tacos 8745",33.3,10,3.69,employeesFrijolitos,"TACO PADO","Venta de taquitos de carne");

        domesticB.printConstruction();
        hotelB.printConstruction();
        commerceB.printConstruction();

        //agrego a Frijolito 2 empleados para poder calcular el precio estimado (metodo numero 2 para agregar empleados a una empresa)
        employeesFrijolitos.add(masterB);
        employeesFrijolitos.add(workerC);
        commerceB.printConstruction();

     //punto 2-D
        System.out.println("PUNTO 2 D \n");
     //Metodo numero 2 para agregar construcciones a una empresa
     enterpriseA.addConstrucctions(hotelB);
     enterpriseA.addConstrucctions(domesticB);
     enterpriseA.addConstrucctions(commerceB);

     enterpriseA.printConstructionsByEnterprise();

    //punto 2-E
        System.out.println("PUNTO 2 E \n");
        //printea Empleados desde construccion
        hotelB.printEmployeesByConstrucction();

    //punto 2-F
        System.out.println("PUNTO 2 F \n");
        //Printea Construcciones desde Empresa
        enterpriseA.printConstructionsByEnterprise();
    }
}

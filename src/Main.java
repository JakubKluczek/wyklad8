import interfaces.Employee;
import interfaces.Tesrer;
import przyklad1.Befor2015EctsCalculationStrategy;
import przyklad1.ITAfter2015EctsCalculationStrategy;
import przyklad1.NonITAfter2015EctsCalculationStrategy;
import przyklad1.Student;
import przyklad2.Database;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ArrayList<Employee> pracownicy=new ArrayList<>();
        //  pracownicy.add(new Tesrer("", "","", ""));

        // Employee emp=new Tesrer("", "", "","");

        Befor2015EctsCalculationStrategy s1 = new Befor2015EctsCalculationStrategy();
        ITAfter2015EctsCalculationStrategy s2=new ITAfter2015EctsCalculationStrategy();
        NonITAfter2015EctsCalculationStrategy s3=new NonITAfter2015EctsCalculationStrategy();

        Student.strategies.add(s1);
        Student.strategies.add(s2);
        Student.strategies.add(s3);

        Student s=new Student("John", "Smith", "1", "23");
        double wynik=s.calculateEctsScore();


        Database d1= Database.createDatabase();
        Database d2= Database.createDatabase();



    }
}
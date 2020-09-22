package ProgLang;

import java.io.*;
public class Employee{
    String name;
    int age;
    String designation;
    double salary;

    // Это конструктор класса Employee.
    public Employee(String name){
        this.name = name;
    }
    // Присвоение возраста работника переменной age.
    public void empAge(int age){
        this.age = age;
    }
    /* Присвоение переменной designation. */
    public void empDesignation(String empDesig){
        designation = empDesig;
    }
    /* Присвоение переменной salary. */
    public void empSalary(double empSalary){
        salary = empSalary;
    }
    /* Вывод подробной информации. */
    public void printEmployee(){
        System.out.println("Имя:"+ name );
        System.out.println("Возраст:" + age );
        System.out.println("Должность:" + designation );
        System.out.println("Заработная плата:" + salary + "$");
    }

}
package ProgLang;

import java.io.*;

public class Employee1{
    // Переменная экземпляра открыта для любого дочернего класса.
    public String name;

    // Переменная salary видна только в Employee.
    private double salary;

    // Имя переменной присваивается в конструкторе.
    public Employee1 (String empName){
        name = empName;
    }

    // Переменной salary присваивается значение.
    public void setSalary(double empSal){
        salary = empSal;
    }

    // Этот метод выводит на экран данные сотрудников.
    public void printEmp(){
        System.out.println("имя: " + name );
        System.out.println("зарплата:" + salary);
    }

    public static void main(String args[]){
        Employee1 empOne = new Employee1("Олег");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}
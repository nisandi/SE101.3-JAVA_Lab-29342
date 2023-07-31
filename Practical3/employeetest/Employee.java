/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeetest;

/**
 *
 * @author ASUS
 */
public class Employee {
    private  String name;
   private int age;
   private double salary; 

    Employee() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
   public String getName()
   {
       return name;
   }
   public void setName(String name)
   {
       this.name=name;
   }
   public int getAge()
   {
       return age;
   }
   public void setAge(int age)
   {
       this.age=age;
   }
   
   public double getSalary()
   {
       return salary;
   }
   public void setSalay(double salary)
   {
       this.salary=salary;
   }

   //Modified Employee Class with Constructor
   public Employee(String name,int age,double salary)
   {
       this.name=name;
       this.age=age;
       this.salary=salary;
   }
   
   
    
}

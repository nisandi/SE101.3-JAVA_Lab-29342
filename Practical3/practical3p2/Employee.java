/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical3p2;

/**
 *
 * @author ASUS
 */
public class Employee {
    private String employeeName;
    private double basicSalary;
    private double bonus;
   
    // Constructor to set the bonus value
    public Employee( String employeeName,double basicSalary,double bonus)
    {
         this.employeeName=employeeName; 
         this.basicSalary=basicSalary;
         this.bonus=bonus;
    }
// Setter and getter for Employee Name
    public String getEmployeeName()
    {
        return employeeName;
    }
    public void setEmployeeName(String employeeName)
    {
      this.employeeName=employeeName;  
    }
// Setter and getter for Basic Salary
    public double getBasicSalary()
    {
        return basicSalary;
    }
    public void setBasicSalary(double basicSalary)
    {
       this.basicSalary=basicSalary;
       
    }

    public double getBonus()
    {
        return bonus;
    }
    
    public double CalculateBonusAmount()
    {
        return basicSalary+bonus;
    }
    
}

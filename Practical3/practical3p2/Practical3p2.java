/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical3p2;

/**
 *
 * @author ASUS
 */
public class Practical3p2 {

    public static void main(String[] args) {
         Employee e1 = new Employee("Bogdan", 50000.0, 10000.0);

        System.out.println("Employee Name: " + e1.getEmployeeName());
        System.out.println("Basic Salary: " + e1.getBasicSalary());
        System.out.println("Bonus: " + e1.getBonus());
        System.out.println("Bonus Amount: " + e1.CalculateBonusAmount());
    }
}

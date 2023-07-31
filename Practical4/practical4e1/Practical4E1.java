/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical4e1;

/**
 *
 * @author ASUS
 */
public class Practical4E1 {

    public static void main(String[] args) {
        
        Employee bogdan=new Employee();
        bogdan.setEmpId(29342);
        bogdan.setEmpName("Mr.Bogdan");
        bogdan.setEmpDesignation("Electronic Engineer");
        
        Employee bird=new Employee();
        bird.setEmpId(29784);
        bird.setEmpName("Ms.Bird");
        bird.setEmpDesignation("Graphic Designer");
        
        System.out.println("Employee Id:"+bogdan.getEmpId());
        System.out.println("Employee Name:"+bogdan.getEmpName());
        System.out.println("Employee Designation:"+bogdan.getEmpDesignation());
        
        System.out.println("\nEmployee Id:"+bird.getEmpId());
        System.out.println("Employee Name:"+bird.getEmpName());
        System.out.println("Employee Designation:"+bird.getEmpDesignation());
        
        
        
    /*output-
       Employee Id:29342
Employee Name:Mr.Bogdan
Employee Designation:Electronic Engineer

Employee Id:29784
Employee Name:Ms.Bird
Employee Designation:Graphic Designer 
        */
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical5e4;

/**
 *
 * @author ASUS
 */
public class Rectangle extends Shape {
     private double width,lenght;
 
    
    public Rectangle(double width, double lenght)
    {
        this.width=width;
        this.lenght=lenght;
       
    }
    
    @Override
     public double calculateArea()
     {
         return width*lenght;
     }
    
}

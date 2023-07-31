/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical5e4;

/**
 *
 * @author ASUS
 */
public class Circle extends Shape {
     private double radius;
 
    
    public Circle(double radius)
    {
        this.radius=radius;
        
    }
    @Override
    public double calculateArea()
    {
        return 3.14159*radius*radius;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical5e4;

/**
 *
 * @author ASUS
 */
public abstract class Shape {
     public abstract double calculateArea();
            public void display(){
                System.out.println("The Area of "+calculateArea());
            }
}

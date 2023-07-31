/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical5e1;

/**
 *
 * @author ASUS
 */
public class InterfaceImplemented extends MyFirstInterface{
    @Override
    public void dispaly()
    {
        x=20;// Error:Cannot assign value to final variable x
        System.out.println(x);
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical2;

/**
 *
 * @author ASUS
 */
public class Item {
    
    //Q1
    private int location;
    private String description;
    
    //Q2,Q3
    public Item(int location,String description)
    {
       this.location=location;
       this.description=description;
    }
    
    //Q4
    public int getLocation()
    {
        return location;
    }
    
    public void setLocation(int location)
    {
        this.location=location;
    }
    
    public String getdescription()
    {
        return description;
    }
    public void setdescription(String description)
    {
        this.description=description;
    }
    
}

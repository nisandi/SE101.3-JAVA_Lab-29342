/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dog;

/**
 *
 * @author ASUS
 */
public class Dog extends Mammal {

    public static void main(String[] args) {
        Animal a = new Animal();
      Mammal m = new Mammal();
      Dog d = new Dog();
      System.out.println(m instanceof Animal); //true
      System.out.println(d instanceof Mammal); //true
      System.out.println(d instanceof Animal);//true
        
    }
}

/*
This demonstrates the concept of inheritance, where subclasses inherit properties and behaviors from their parent classes.
In this example, Mammal and Dog are both subclasses of Animal, and as a result, 
the instanceof operator returns true when checking their relationships with Animal.
*/


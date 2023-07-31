/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testperson;

/**
 *
 * @author ASUS
 */
public class TestPerson {

    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Namal");
        s1.setId(25098);
        s1.setCourse("Software Engineering");
        
        Lecture L1= new Lecture();
        L1.setName("Dilhara");
        L1.setId(29875);
        L1.setProgramme("Computer Science");
        
        System.out.println("Student Details");
        System.out.println("Name:"+s1.getName());
        System.out.println("Id:"+s1.getId());
        System.out.println("Course:"+s1.getCourse());
        
        System.out.println("\nLecture Details");
        System.out.println("Name:"+L1.getName());
        System.out.println("Id:"+L1.getId());
        System.out.println("Programme:"+L1.getProgramme());
    }
}
/*Output-
Student Details
Name:Namal
Id:25098
Course:Software Engineering

Lecture Details
Name:Dilhara
Id:29875
Programme:Computer Science
*/
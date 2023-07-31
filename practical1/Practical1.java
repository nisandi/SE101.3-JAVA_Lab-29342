/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical1;

/**
 *
 * @author ASUS
 */
public class Practical1 {

    public static void main(String[] args) {
        
        //Q1
        System.out.println("Hello World!");
        
        //Q2
        System.out.println("Nisandi Sahanya");
        System.out.println("Software Engineering");
        
        //Q3
        //using for loop
        int i;
        for(i=0;i<5;i++)
        {
            System.out.println("Executing Loop "+i);
        }
        
        //using while loop
        int j=0;
        while(j<5)
        {
           System.out.println("Executing Loop"+j);
           j++;
        }
        
        //Q4
      int [] numbers = {10, 20, 30, 40, 50};
      for(int x : numbers ){
         if( x == 30 ){
	    break;
         }
         System.out.print( x );
         System.out.print("\n");
      }
          System.out.println("I’m  out of the Loop now");
          /* RESULT-
          10
          20
          I’m  out of the Loop now
          */
      
      for(int x : numbers ){
         if( x == 30 ){
	    continue;
         }
         System.out.print( x );
         System.out.print("\n");
      }
        System.out.println("I’m  out of the Loop now");
        
        
        /*RESULT-
        10
        20
        40
        50
        I’m  out of the Loop now
        */
        
        
        //Q5
        char grade ='A';
	 switch(grade)
	{
	case 'A' :
	System.out.println("Excellent!"); 
	break;
	case 'D' :
            System.out.println("You passed");
	case 'F' :
	   System.out.println("Better try again");
        break;
	default :
	System.out.println("Invalid grade");
         }
	System.out.println("Your grade is " + grade);
        
        /*output-
        Excellent!
        Your grade is A
        */
  	
	 switch(grade)
	{
	case 'A' :
	System.out.println("Excellent!"); 
	
	case 'D' :
            System.out.println("You passed");
	case 'F' :
	   System.out.println("Better try again");
        break;
	default :
	System.out.println("Invalid grade");
         }
	System.out.println("Your grade is " + grade);
        
        /*output
        Excellent!
        You passed
        Better try again
        Your grade is A
        */
        
     // Using if-else-if
	 if(grade=='A')
	{
	
	System.out.println("Excellent!"); 
        }
         else if(grade=='D') 
         {
             System.out.println("You passed");
         }
         else if(grade=='F') 
         {
	   System.out.println("Better try again");
         }
        
         else
         {
	   System.out.println("Invalid grade");
         }
	
           System.out.println("Your grade is " + grade);
    
          /*output
           Excellent!
           Your grade is A
           */
          
           // Q6
            int [] marks = {10, 20, 30, 40, 50};
      		for(int x : marks ){
        			 System.out.print( x );
         			System.out.print(",");
      		}
	             System.out.print("\n");
      	    String [] names ={"James", "Larry", "Tom", "Lacy"};
      		for( String name : names ) {
        		 	System.out.print( name );
         			System.out.print(",");
                }
                /*output
            10,20,30,40,50,
             James,Larry,Tom,Lacy,
           */
}
}

        
    


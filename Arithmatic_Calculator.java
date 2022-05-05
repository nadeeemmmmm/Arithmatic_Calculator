package com.simplilearn.org;

import java.util.Scanner;

public class Arithmatic_Calculator {

	public static void main(String[] args) {
        float num1=0;
	    float num2=0;
	    double result=0;
	    int opar=0;
	   
	    Scanner sc= new Scanner(System.in);
	   
	   System.out.println("Enter num1: ");
	   num1=sc.nextFloat();
	   System.out.println("Enter num2: ");
	   num2=sc.nextFloat();
	   System.out.println("Enter the opar: ");
	   opar=sc.nextInt();
	   
	   switch(opar) {
	   case 1:
		   result=num1+num2;
	   	   break;
	   case 2:
		   result=num1-num2;
		   break;
	   case 3:
		   result=num1*num2;
		   break;
	   case 4:
		   result=num1/num2;
		   if(num2==0)
			   System.out.println("Enter valid denominator");
		   break;
   }
	   System.out.println("The answer is: " +result);
	}
		
	
	    
	   
	   

}

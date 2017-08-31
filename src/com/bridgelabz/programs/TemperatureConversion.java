/******************************************************************************
 *  Compilation:  javac -d bin TemperatureConversion .java
 *  Execution:    java -cp bin com.bridgelabz.util.TemperatureConversion n n
 
 *  Purpose: accept celcius and fahrenhite from user and convert 
			 celcius to fahrenhite and vice versa
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util.*;
import java.util.Scanner;
import com.bridgelabz.util.Utility;
package com.bridgelabz.programs;


public class TemperatureConversion{
    public static void main(String[] args) {
      	Scanner scan=new Scanner(System.in);
		int tempCel= Integer.parseInt(args[0]);
		int tempFar= Integer.parseInt(args[1]);
		System.out.println();
		System.out.println("The Entered value of Celsius is :" +tempCel+ "   and Fahrenhite is :" +tempFar);
		System.out.println();    
		System.out.println("MENU:");		//display menu tu user 
		System.out.println("1. Celcius to Fahrenhite");  
		System.out.println("2. Fahrenhite to Celcius");
		System.out.println();
		System.out.println("Enter your choice 1 or 2 :");
		/*accept choice form user using nextInt() and store int value in reslut variable*/
		int choice=scan.nextInt();		
		System.out.println("The entered choice is= " +choice);		//print choice entered by user
		Utility.temperatureConversion(tempCel,tempFar,choice);
	}
}
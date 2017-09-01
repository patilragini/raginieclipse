/******************************************************************************
 *  Compilation:  javac -d bin Sqrt .java
 *  Execution:    java -cp bin com.bridgelabz.util.Sqrt 
 *  
 *  Purpose: Computes the square root of a nonnegative number c using
 *  	  Newton's method:
 *     - initialize t = c
 *     - replace t with the average of c/t and t
 *     - repeat until desired accuracy reached
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   12-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;


public class Sqrt { 
	static double number;
    public static void main(String[] args) { 
		int number = Integer.parseInt(args[0]);
		System.out.println("square root of "+number+" is");
		Utility.sqrt(number);
	}
}
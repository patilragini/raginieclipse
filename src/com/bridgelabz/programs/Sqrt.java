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

import com.bridgelabz.util.Utility;
package com.bridgelabz.programs;

public class Sqrt { 
	static double number;
    public static void main(String[] args) { 
		number = Double.parseDouble(args[0]);
		Utility.sqrt(number);
	}
}
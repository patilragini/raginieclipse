
/******************************************************************************
*  Purpose: Determines whether entered  Quadratic equation is imaginary and find roots of equation
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import java.util.Scanner;

public class Quadratic{
	static int a,b,c;
	static double r1,r2,d;
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println(" give quadratic equation =ax^2 +bx +c");
		System.out.println("enter a: b: c:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("given quadratic eqn is:"+a+" x^2 +"+b+"x+"+c);
		Utility.quadratic(a,b,c);
	}
}
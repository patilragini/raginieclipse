/******************************************************************************
 *  Compilation:  javac -d bin Payment.java
 *  Execution:    java -cp bin com.bridgelabz.util.Payment n n n
 *  
 *  Purpose: Determines monthlly payment take principle,year and rate entered by user 
			 and gives payment to be made monthlly
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import com.bridgelabz.util.Utility;
package com.bridgelabz.programs;

public class Payment{
		public static void main(String args[]){
		/*  principle,year and rate is given by user is accepted as args[0],args[1],args[2] as string ,they are converted to 
		double Double.parseDouble(args[]);*/
		double principle=Double.parseDouble(args[0]);
		double year=Double.parseDouble(args[1]); 
		double rate=Double.parseDouble(args[2]);
		Utility.monthlyPayment(principle,year,rate);
	}
}
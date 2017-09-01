
/******************************************************************************
 *  Compilation:  javac -d bin DayOfWeek.java
 *  Execution:    java -cp bin com.bridgelabz.util.DayOfWeek n n n 
 
 *  Purpose: Determines day of enterd date month year by user
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
	
	public class DayOfWeek{
		static int month,date,year;
		public static void main(String args[]){
			date=Integer.parseInt(args[0]);
			month=Integer.parseInt(args[1]);
			year=Integer.parseInt(args[2]);
			Utility.dayOfWeek(date,month,year);
		}
	}
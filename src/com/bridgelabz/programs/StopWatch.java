
/***************************************************************************
* Purpose : To create stop watch to count elapsed time of program
*
* @author   ragini
* @version  1.0
* @since    20-08-2017
****************************************************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class StopWatch {
public static void main(String args[]) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("press y to start stop watch else n:");
	char choice=scanner.next().charAt(0);
	if(choice=='y'){
		long currentTime=Utility.startStopWatch();
		System.out.println("current timein ms "+System.currentTimeMillis());
		System.out.println("stop watch stared");		
		System.out.println("press n to  stop stopwatch and get elapsed time between start ans stop time");
		char ch=scanner.next().charAt(0);
		if(ch=='n')
		{
			long elapsedTime=Utility.elapsedTime(currentTime);
			System.out.println("Elapsed time :"+elapsedTime+"mili seconds");
		}		
	}
	else System.out.println("__");	
}    
}
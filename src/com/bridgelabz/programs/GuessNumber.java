/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int max_num=sc.nextInt();
		System.out.println(" remmember any 1 number between 0 to "+(max_num-1));
		Utility.guessNumber(0, max_num-1);
		sc.close();
	}
}


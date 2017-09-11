/****************************************************************************** 
 *  Purpose: Determines entered strings are anagram or not 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

import java.util.Scanner;
import com.bridgelabz.util.Utility;

public class AnagramCheck{
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter two strings");
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		Utility.anagramChecker(str1,str2);
	}
}
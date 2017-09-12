package com.bridgelabz.datastructure;

import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class orderedList {
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) throws IOException,IndexOutOfBoundsException  {
		char ch;
		//will enter do while loop once 
		do {
		System.out.println("Enter the number you want to search :");
		int number=scan.nextInt();
		Utility.searchIntFromFile(number);
		System.out.println("Want to continue y/n ?");
		ch=scan.next().charAt(0);
		} while (ch=='y'||ch=='Y');//continue operarting linked list till 'y'
	 
		} 
	
	
}

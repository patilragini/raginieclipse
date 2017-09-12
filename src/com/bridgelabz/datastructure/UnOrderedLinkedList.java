package com.bridgelabz.datastructure;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.util.Utility;
public class UnOrderedLinkedList {
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char ch;
		//will enter do while loop once 
		do {
		System.out.println("Enter the city you want to search:");
		String word=scan.next();
		Utility.searchWordFromFile(word);
		System.out.println("Want to continue ?");
		ch=scan.next().charAt(0);
		} while (ch=='y'||ch=='Y');//continue operarting linked list till 'y'
	 
		
	}

}

package com.bridgelabz.programs;
import java.util.Scanner;
import com.bridgelabz.util.Utility;

public class BinarySearchChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char array[];
	    Scanner in = new Scanner(System.in);
	    array  = Utility.createArrayChar();
	    System.out.println("Enter character to search");
	    char variable = in.next().charAt(0);
	    Utility.binarySearchChar(array,variable);
	}

}

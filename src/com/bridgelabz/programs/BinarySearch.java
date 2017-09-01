package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int  n,array[];
		    Scanner in = new Scanner(System.in);
		    System.out.println("Enter number of elements");
		    n = in.nextInt(); 
		    array  = Utility.createArrayInt(n);
		    System.out.println("Enter number to search");
		    int num = in.nextInt();
		    Utility.binarySearchInt(array,num);
	}
}
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class BubbleSortInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array;
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter number of elements in array");
	    int num = in.nextInt(); 
	    array  = Utility.createArrayInt(num);
	    array =  Utility.BubbleSortInt(array,num);
	    Utility.printArrayInt(array);
	}

}

package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

import java.util.Scanner;
import com.bridgelabz.util.*;

public class SumOfThree {
	static int flag=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of  ELEMENTS");
		int num = scanner.nextInt();

		int [] array= Utility.createArrayInt(num);
		Utility.sumOfThreeIsZero(array);
	}
}

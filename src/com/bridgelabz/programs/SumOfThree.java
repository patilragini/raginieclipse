package com.bridgelabz.programs;
import java.util.Scanner;
import com.bridgelabz.util.*;

public class SumOfThree {
	static int flag=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of  ELEMENTS");
		int num = scanner.nextInt();
		scanner.close(num);
		int array[]=Utility.createArray(num);
		Utility.sumOfThreeIsZero(array);
	}
//		Utility.arrayTwoDim(num); function in utility class
}

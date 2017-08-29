package com.bridgelabz.programs;

import java.util.*;

//import com.bridgelabz.util.Utility;

public class SumOfThree {
	static int flag=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter nsumber of  ELEMENTS");
		int num = scanner.nextInt();
		int array[]=new int[num];
		for(int i=0;i<num;i++){
			array[i]= scanner.nextInt();
		}
		scanner.close();
		for(int i=0;i<num;i++){
			for(int j=i;j<num;j++){
				for(int k=i+2;k<num;k++){
					int sum=(array[i]+array[j]+array[k]);
					if(sum==0){
						System.out.println(" sum of "+array[i]+"+"+array[j]+"+"+array[k]+" is 0");
						
					}
					//else{System.out.println("none of sum is 0");}
					flag++;
				}
				
			}
					
		}
		if(flag==0){
		System.out.println("none");}
				
	}
	
//		Utility.arrayTwoDim(num);
}

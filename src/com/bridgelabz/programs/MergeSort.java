/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   9-09-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str2[]={"tag","aaa","bat","mat","cat","mat","fat"};
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter number of string");
		int size;
		size=sc.nextInt();
		String[] array = new String[size];
		System.out.println("enter stringsz..");
		for (int i = 0; i < size; i++) {
			array[i]=sc.nextLine();
		}			
		array=Utility.mergeSort(array);
		for(int i=0;i<array.length;i++){
		System.out.println(array[i]);
		}
		sc.close();
	}


}

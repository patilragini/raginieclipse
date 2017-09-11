/* ****************************************************************************
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class BinarySearchGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		    	Utility is = new Utility();
				System.out.println("Bubble Sort Generic \nChoose the type of Array:");
				System.out.println("1: Integer"); 
				System.out.println("2: char");
				System.out.println("3: String");
				int choose=input.nextInt();
				boolean flag=false;
				System.out.println("enter size of array");
				int size=input.nextInt();
				System.out.println("\n enter array in ascending order");
				if (choose == 1){
					
					Integer[] array = new Integer[size];
					for (int i = 0; i < size; i++) {
						System.out.println();
						array[i]=input.nextInt();
					}
					System.out.println("enter element to search");
					int element=input.nextInt();
					flag=is.binarySearchGeneric(array,element);
					Utility.printArray(array);
					flag=true;
				}
				else if (choose ==2){
					Character crr[]=new Character[size];
					 System.out.println("enter characters");
				        for(int i=0;i<size;i++)
				        {
				            char c=input.next().charAt(0);
				            crr[i]= c;
				        }
				        Utility.printArray(crr);
				        System.out.println("enter element to search");
						char element=input.next().charAt(0);
						flag=is.binarySearchGeneric(crr,element);
						Utility.printArray(crr);
						flag=true;
				     }
				else if (choose == 3){
					String[] array = new String[size];
					for (int i = 0; i < size; i++) {
						System.out.println();
						array[i]=input.nextLine();
					}
					Utility.printArray(array);
					System.out.println("enter element to search");
					String element=input.nextLine();
					flag=is.binarySearchGeneric(array,element);
			        Utility.printArray(array);
			        flag=true;
				}
				else 
					System.out.println("Error ");
				
				if(flag==true){
					System.out.println("FOUND");
				}
				else System.out.println("NOT FOUND");
		
	}


}

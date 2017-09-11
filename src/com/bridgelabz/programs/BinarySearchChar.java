/* ****************************************************************************
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;
import java.util.Scanner;
import com.bridgelabz.util.Utility;

public class BinarySearchChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
    	Utility is = new Utility();
    	boolean flag=false;
		System.out.println("enter size of array");
		int size=input.nextInt();
		System.out.println("\n enter array in ascending order");
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
		
		if(flag==true){
			System.out.println("FOUND");
		}
		else System.out.println("NOT FOUND");
			
	}

}

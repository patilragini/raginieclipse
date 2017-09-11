
/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   1-09-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

public class SearchAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("3.binarySearch method \n2.insertionSort method \n1.bubbleSort method ");
		int choose=input.nextInt();
		switch	(choose){
			case 1:
				InsertionSortGeneric.main(null);
				break;
			case 2:
				BubbleSortGeneric.main(null);
				break;
			case 3:
				BinarySearchGeneric.main(null);
				break;
			case 4:
				System.out.println("error");
		}

	}
}

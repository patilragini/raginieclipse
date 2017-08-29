/****************************************************************************** 
 *  Purpose: to take row and column from user and print 2d array
 *
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   28-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;
import java.util.Scanner;
import com.bridgelabz.util.Utility;

public class ArrayTwoDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of rows and column: ");
		int rowCount = scanner.nextInt();
		int colCount = scanner.nextInt();
		
		Utility.arrayTwoDim(rowCount,colCount);
		scanner.close();
	}

}

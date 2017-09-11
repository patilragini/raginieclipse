/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   1-09-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;
import java.util.Scanner;
import com.bridgelabz.util.Utility;

public class TwoDimArrayGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.println("enter row and column");
			int row = input.nextInt();
			int coloumn = input.nextInt();
			
			 System.out.println("Choose the type of Array:");
			 System.out.println("1: Integer"); 
			 System.out.println("2: Boolean");
			 System.out.println("3: Double");
			 int choice=input.nextInt();
			 Utility.arrayDisplayTwoDimGeneric(row, coloumn, Utility.arrayCreateGenericTwoDim(row,coloumn,choice));
			 input.close();
		}
		
	}


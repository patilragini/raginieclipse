//1
/****************************************************************************** 
 *  Purpose: take user name and print 
				hello <username > how are you?
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.programs;
import java.util.Scanner;
import com.bridgelabz.util.Utility;

public class PrintUsername {
	private static Scanner n;
	public static void main(String[] args) {
		n=new Scanner(System.in);
		System.out.println("Enter User name:");
		String name=n.next();
		Utility.printUsername(name);
	}
}
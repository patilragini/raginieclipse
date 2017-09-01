
package com.bridgelabz.programs;
import java.util.Scanner;
import com.bridgelabz.util.Utility;

public class insertionSortChar{

	public static void main(String[] args) {
		String array[]={"abc","pqr","cat"};
		Scanner scanner = new Scanner(System.in);	
		//System.out.println("Enter number of words : ");
		//int num = scanner.nextInt();
		//array=Utility.createArrayString(num);
		//Utility.printArrayString(array);
		Utility.insertionSortString(array);
	
		/*String[] strings = new String[count];
		System.out.print("Enter words to sort: ");
		for(int i = 0; i < count; i++) {
			strings[i] = scanner.next();
		}
		
		Utility utility = new Utility();
		strings = utility.insertionSortString(strings,count);
		
		for(String string : strings) {
			System.out.println(string);
		}
		scanner.close();*/
	}

}

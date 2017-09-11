/* ****************************************************************************
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;

import java.util.Scanner;

public class BinarySearchGuess {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int  n;
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the Number N i.e N = 2^n");
	     n = in.nextInt(); 
	     int left=0;
	     int right=n;
	     int num=(int)(Math.pow(2,n));
	     System.out.println("guessed number between "+left+"-"+num);
		 char check=in.next().charAt(0);
		 if(check=='y'){
			 while(left!=right){		
	    	 int  middle = (left + num)/2;
	    	 System.out.println("is guessed number between "+left+"-"+middle+
	    			 ": 1 \n or "
	    			 + ""+(middle+1)+"- "+num+":2");
			 int c=in.nextInt();
			 if(c==1){
				 middle = (left + right)/2;
				 left=middle+1;
			 }
			 else if(c==2)
			 {
				 right=middle+1;
			 }
			 
	     }
	     
}}}
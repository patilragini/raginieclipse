/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   8-09-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in); 
		int change=scanner.nextInt();
		int notes[]={1000,500,100,50,10,2,1};
		int noteCount[]=new int[notes.length];
		if(change>0){
			Utility.giveChange(noteCount,change,0);
			for(int i=0;i<notes.length;i++){
				if(noteCount[i]!=0)
					System.out.println(notes[i]+" Rs note= "+noteCount[i]);
			}
		}
		else System.out.println("no change");
	}
}

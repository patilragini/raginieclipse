/******************************************************************************
 *  Compilation:  javac -d bin Binary .java
 *  Execution:    java -cp bin com.bridgelabz.util.Binary  
 *  
 *  Purpose: Prints out n in binary.
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   12-08-2017
 * Remarks
 * eg 10 =1010   16bits=[ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0]
 *               sum=10
 *               swap upper 8 bit nibble with lower 8 bit nibble
 *               [0, 0, 0, 0, 0, 0, 0, 0, 0],[0, 1, 0, 1, 0, 0, 0, 0, 0]
 *               new swap array =[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0]
 *  			 total after swap 5120
 *  could use Integer.toBinaryString(N) instead.
 ******************************************************************************/
 
package com.bridgelabz.programs;
import java.util.ArrayList;
import java.util.Collections;

import com.bridgelabz.util.Utility;

/**
 * @author ragini patil
 *@example Remarks
 * eg 10 =1010   16bits=[ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0]
 *               sum=10
 *               swap upper 8 bit nibble with lower 8 bit nibble
 *               [0, 0, 0, 0, 0, 0, 0, 0, 0],[0, 1, 0, 1, 0, 0, 0, 0, 0]
 *               new swap array =[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0]
 *  			 total after swap 5120
 *  could use Integer.toBinaryString(N) instead.
 */
public class ToBinary { 
    public static void main(String[] args) { 
        // read in the command-line argument
        int n = Integer.parseInt(args[0]);
        System.out.println(n);
        // set power to the largest power of 2 that is <= n
		ArrayList array=Utility.toBinary(n);
		Utility.swapNibbles(array);
	}
    
}
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
 *  -------
 *  could use Integer.toBinaryString(N) instead.
 ******************************************************************************/
 
import com.bridgelabz.util.Utility;
package com.bridgelabz.programs;


public class Binary { 
    public static void main(String[] args) { 
        // read in the command-line argument
        int n = Integer.parseInt(args[0]);
        // set power to the largest power of 2 that is <= n
		Utility.toBinary(n);
	}
}
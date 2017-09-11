/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   9-09-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class PrimeRange {
        public static void main(String args[]) {       
       int minRange=Integer.parseInt(args[0]);
        int maxRange=Integer.parseInt(args[1]);

        for(int i=minRange;i<=maxRange;i++) {
            
            int prime=Utility.checkPrime(i);
            if(prime!=0) {
            System.out.println(prime);
            }
       } // End of for loop
}
}

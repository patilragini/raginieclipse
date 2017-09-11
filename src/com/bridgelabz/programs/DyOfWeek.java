/********************************************************************************
 *Perpose:  Give Day Of Week that takes a date as input and
 *           returns the day of week that date falls on using functions  
 *@author: Ragini Patil
 *@version: 1.8
 *@since: 19-08-2017
 ********************************************************************************/
package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

class Calendar {
    public static void main(String args[]){

        //prints and call the static fucntion
       Utility.dayOfWeek(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
    }
}

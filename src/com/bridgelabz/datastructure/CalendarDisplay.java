/*************************************************
 *Purpose: Take month and year and Display calendar 
 *
 *@author:Patil Ragini
 *@version: 1.8
 *@since: 19-08-2017
 **************************************************/

package com.bridgelabz.datastructure;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class CalendarDisplay
{
   
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        if(month < 1 || month > 12)
        {
            System.out.println("Invalid month. Valids inputs are 1-12.");
            System.exit(0);
        }
        System.out.print("Enter year: ");
        int year = input.nextInt();
        if(year < 1753)
        {
            System.out.println("Invalid year. Valid inputs are 1753 and beyond.");
            System.exit(0);
        }
        if(Utility.leap(year))
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is NOT a leap year.");
        }
        Utility.firstDayOfYear(year);
        Utility.firstDayOfMonth(month, year);
        Utility.numDaysInMonth(month, year);
        Utility.printCal(month, year);
    }    
}
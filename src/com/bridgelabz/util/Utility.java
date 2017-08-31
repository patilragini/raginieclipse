
package com.bridgelabz.util;

public class Utility {
	public static void binary(int n) {
		// set power to the largest power of 2 that is <= n
		int power = 1;
		while (power <= n / 2) {
			power *= 2;
		}
		// check for presence of powers of 2 in n, from largest to smallest
		while (power > 0) {
			// power is not present in n
			if (n < power) {
				System.out.print(0);
			}
			// power is present in n, so subtract power from n
			else {
				System.out.print(1);
				n -= power;
			}
			// next smallest power of 2
			power /= 2;
		}
		System.out.println();
	}
	//1
	public static void printUsername(String name){
		System.out.println("  Hello "+name+",How are you?");
	
	}
	static int headctr,tailctr,year;
	public static void flipCoin(int n){
		//math.random() returns value between 0.0 and 1
		//so it is heads or tail 50% of time
		float h,t;
		int num=n;
		System.out.println("Number of flips="+num);
		for(int i=0;i<num;i++){
			if(Math.random()<0.5){
				headctr=headctr+1;
			}
			else{
				tailctr++;
			}
		}
		System.out.println("Heads percentage"+headctr);
		System.out.println("Tails percentage"+tailctr);
		h=headctr;
		h=(h/num)*100;
		t=(tailctr);
		t=(t/num)*100;
		System.out.println("Heads percentage"+h+"%");
		System.out.println("Tails percentage"+t+"%");
	}
	public static void leapYear(int year){
			boolean isLeapYear;
			//see if year is divisible by 4 and remainder==0
			isLeapYear=(year%4==0); 
			//cheak if it is centuary  and divisible by 4 then true else false
			isLeapYear=isLeapYear && (year%100 != 0);
			//divisible by 4&100 unless/or divisible by 400
			isLeapYear=isLeapYear || (year%400 == 0);
			//print the value
			if(isLeapYear==true)
			System.out.println(year+"  is leap year");
			else System.out.println(year+"  is not leap year");
	}
	public static  double harmonic(int n){
	        float i = 1;
	        double mHarmonicNumber = 0;
	        int mNthNumber = n;
	        while(i <= mNthNumber) {
	            System.out.print("+ ");
	            mHarmonicNumber = mHarmonicNumber + (1/i) ;
	            System.out.print("1/"+i);
	            i++;
	        }
	        return mHarmonicNumber;
	    }
	
}

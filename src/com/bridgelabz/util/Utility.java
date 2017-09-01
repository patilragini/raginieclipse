 /*  @author  Ragini Patil
 *  @version 1.0
 *  @since   28-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Arrays;  
import java.util.Scanner;
import java.util.*;

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

	public static void printUsername(String name){
		System.out.println("  Hello "+name+",How are you?");
	
	}
	
	public static void powerOfTwo(int num){
		for(int i=0;i<=num;i++)
				{			
				System.out.print(i);
				System.out.print("\t"+Math.pow(2,i));
				System.out.println();
				}
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
	        float i = 2;
	        double mHarmonicNumber = 0;
	        int mNthNumber = n;
	        System.out.print(" 1/1.0 ");
	        while(i <= mNthNumber) {
	            System.out.print("+ ");
	            mHarmonicNumber = mHarmonicNumber + (1/i) ;
	            System.out.print("1/"+i);
	            i++;
	        }
	        return (mHarmonicNumber+1);
	    }
	
	public static void gambler(int stake,int goal,int trials){
		int bets = 0;        // total number of bets made
        int wins = 0; // total number of games won
       	int cash=0;
		// repeat trials times
        for (int t = 0; t < trials; t++) {
            // do one gambler's ruin simulation
            cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;     // win $1
                else                     cash--;     // lose $1
            }
            if (cash == goal) wins++;                // did gambler go achieve desired goal?
        }
        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Average  bets           = " + 1.0 * bets / trials);
	}

	public static  void getcpn(int number){
	}
	//Print  array
	public static void printArrayInt(int [] array){
		int len=array.length;
		System.out.println("elements in array are :" );
		for(int i=0;i<len;i++){
			System.out.println(array[i]);
		}
	}
	public static void printArrayChar(char [] array){
		int len=array.length;
		System.out.println("elements in array are :" );
		for(int i=0;i<len;i++){
			System.out.println(array[i]);
		}
	}
	public static void printArrayString(String [] array){
		int len=array.length;
		System.out.println("elements in array are :" );
		for(int i=0;i<len;i++){
			System.out.println(array[i]);
		}
	}
	//create array of integer of size num and return integer array
	public static int[] createArrayInt(int num){
		Scanner scanner = new Scanner(System.in);
		int array[]=new int[num];
	    System.out.println("Enter " + num + " values ");
		for(int i=0;i<num;i++){
			array[i]= scanner.nextInt();
		}
		return array;
	}
	//create array of character and return char array 
		public static char[] createArrayChar(){
			Scanner scanner=new Scanner(System.in);
			String word ;
			System.out.println("enter the string");
			word=scanner.next();
	        char crr[]=word.toCharArray();  
	        return crr; //return char array
		}
	//create array of c String and return String array 
		public static String[] createArrayString(int num){
				Scanner scanner=new Scanner(System.in);
				String words[]=new String[num];
				System.out.println("enter the"+num+" strings");
				
				for(int i = 0; i < num; i++)
		        {
		            words[i] = scanner.nextLine();
		        }
				System.out.println(words[2]);
		        return words;//return array of words
			}
	
	static int flag=0;
	public static void sumOfThreeIsZero(int array[] ){
		int num=array.length;
		for(int i=0;i<num;i++){
			for(int j=i;j<num;j++){
				for(int k=i+2;k<num;k++){
					int sum=(array[i]+array[j]+array[k]);
					if(sum==0){
						System.out.println(" sum of "+array[i]+"+"+array[j]+"+"+array[k]+" is 0");
						
					}
					//else{System.out.println("none of sum is 0");}
					flag++;
				}
				
			}
					
		}
		if(flag==0){
			System.out.println("none of element is =0");
		}
	}
	
	public static void euclideanDistance(double x,double y){
		double powx =(double) Math.pow(x,2); 		
		System.out.println("Power of x="+powx);
		double powy =(double) Math.pow(y,2); 
		System.out.print("Power of y="+powy);
		/* Math.sqrt is mathematical function in lang package for taking square root*/
		double dist =(double) Math.sqrt(powx+powy);  //distance formula.
		System.out.println("Distance from ("+x+"," +y+") to (0,0)="+dist);
		/* Math.pow is mathematical function in lang package for taking power of given number*/
	}

	public static void stopWatchSimulator(double stopsec){
		long startTime=System.currentTimeMillis();
		long total = 0;
		long stopmilisec=(long) (stopsec*1000);
	    for (int i = 0; i < stopmilisec; i++) {
	      total = total+ i;
	    }
	    
		long stopTime=System.currentTimeMillis();
		System.out.println(stopTime-startTime+" milliseconds");
	}
	 
	public static void quadratic(int a,int b,int c){
		int delta=b*b-4*a*c;
			double r1,r2;
			if(delta>0){
				System.out.println("roots are real and unequal");
				r1=(-b+Math.sqrt(delta)/(2*a));
				r2 = (-b-Math.sqrt(delta)/(2*a));
				System.out.println("1st root is "+r1);
				System.out.println("2nd root is "+r2);
			}
			else if (delta==0){
				System.out.println("1st root are real and eqal");
				r1=(-b+Math.sqrt(delta)/(2*a));
				System.out.println("root:"+r1);
			}
			else{
				System.out.println("imaginary root:");
			}
	}

	public static void windChill(double temp,double windspeed){
		double a,b,c,windchil=0;		// double variables to store calculations
		if(temp<=50&& (windspeed<=120 && windspeed>=3)){
			a=(35.74+0.6215);		//stores addition of double values
			b=((0.4275*temp)-35.75);
			/* Math.pow is mathematical function in lang package for taking power of given number*/
			c=Math.pow(windspeed,0.16);		//(v,0.16) 0. is raise to power of v and stored in v variable
			windchil=(a+(b*c));		
		}
		System.out.println("  windspeed ="+windspeed+"\n  temperature ="+temp+"\n   Wind Chill="+windchil);
	}

	public static void anagramChecker(String str1,String str2){
		String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } 
		else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
            System.out.println(s1 + " and " + s2 + " are anagrams");  
        } 
		else {  
            System.out.println(s1 + " and " + s2 + " are not anagrams");  
        }  
    } 
	

	public static void dayOfWeek(int date,int month,int year){
			int y=(year-((14-month)/12));
			int x=(y+(y/4)-(y/100)+(y/400));
			int m=(month+12*((14-month)/12)-2);
			int d=((date+x+(31*m)/12)%7);
			// print day
			System.out.println("day is ="+d);
			// d is used as choice in switch
			switch(d){
				case 0:
				//case 0 true print sunday
				System.out.println("Sunday");
				break; 		//break and go out of switch
				case 1:
				System.out.println("Monday");
				break;
				case 2:
				System.out.println("Tuesday");
				break;
				case 3:
				System.out.println("Wednesday");
				break;
				case 4:
				System.out.println("Thursday");
				break;
				case 5:
				System.out.println("Friday");
				break;
				case 6:
				System.out.println("Saturday");
				break;
			}
	}
	
	
	public static void temperatureConversion(int tempCel,int tempFar,int choice){
		switch(choice){
				//if result=1 then case 1 execute
			case 1:
				float ResultFar = (tempCel*9/5)+32;		//formula of celcius to fahrenhite
				System.out.println(" The" +tempCel+" in celcius is converted to " +ResultFar+ "in Fahrenhite");
				break;//break come out of switch.
			case 2: 
				float ResultCel =(tempFar-32)*5/9;		//formula of fahrenhite to celcius 
				System.out.println(" The" +tempFar+ " in Fahrenhite is converted to " +ResultCel+ "in Celcius");
				break;//break come out of switch.
			default: System.out.println("invalid entry ");	//if result is not in case,come out of switch print
		}
	}

	public static void monthlyPayment(double principle,double year,double rate){
		double n,r,payment;//n,r,payment are variables to store calculations
		r=(rate/(12*100));		//calculate r
		n=12*year;				//calculatre n
		payment=(principle*r)/(1-Math.pow(1+r,(-n)));		//payment formula
		System.out.println("monthly payment="+payment+"rs");		//print payment to be paied
	}

	static double epsilon = 1e-15,t;
	public static void sqrt(int number){
		epsilon = 1e-15;    // relative error tolerance
        t = number;              // estimate of the square root of c
        // repeatedly apply Newton update step until desired precision is achieved
		if(number>=0){
			while (Math.abs(t - number/t) > epsilon*t) {
            t = (number/t + t) / 2.0;
			}
		}
		else  System.out.println("invalid number");
        // print out the estimate of the square root of c
        System.out.println(t);
	}
	public static void toBinary(int n){
		int power = 1;
        while (power <= n/2) {
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
	
	public static void arrayTwoDim(int rows,int columns){
		Scanner scanner = new Scanner(System.in);
		int[][] array = new int[rows][columns];
		for(int i = 0; i<rows; i++){
		    for(int j = 0; j<columns; j++){
		        array[i][j] = scanner.nextInt();;
		    }
		}
		
		for(int i = 0; i<rows; i++){
		    for(int j = 0; j<columns; j++) {
		        System.out.print("  "+array[i][j]);
		    }
		    System.out.println();
		}
	}
	
	
	public static void factorization(int n){
		for (int factor = 2; factor*factor <= n; factor++) {
            // if factor is a factor of n, repeatedly divide it out
            while (n % factor == 0) {
                System.out.print(factor + " "); 
                n = n / factor;
            }
        }
        // if biggest factor occurs only once, n > 1
        if (n > 1) System.out.println(n);
        else       System.out.println();
    	}
	
	
	public static void binarySearchInt(int [] array,int numFind){
		int n=array.length;
		int first  = 0;
		int last   = n - 1;
		int middle = (first + last)/2;
		
	    while( first <= last )
	    {
	      if ( array[middle] < numFind )
	        first = middle + 1;    
	      else if ( array[middle] == numFind ) 
	      {
	        System.out.println(numFind + " found at location " + (middle + 1) + ". by Binary Seach");
	        break;
	      }
	      else
	         last = middle - 1;
	 
	      middle = (first + last)/2;
	   }
	   if ( first > last )
	      System.out.println(numFind + " is not present in the list.\n ... searching done by binary search");
	  }
	
	public static void binarySearchChar(char []array,char variable){
		int n=array.length;
		int first  = 0;
		int last   = n - 1;
		int middle = (first + last)/2;
		boolean ispresent=false;
		if (array[first]==variable){
			System.out.println("found at "+first+"th location");
			ispresent=true;
			}
		else if(array[last] ==variable){
			System.out.println("found at "+last+"th location");
			ispresent=true;
			}
		
	    while( first <= last ){
	      if ( array[middle] != variable )
	        first = middle + 1;    
	      else if ( array[middle] == variable ) 
	      {
	        System.out.println(variable + " found at location " + (middle + 1) + "th. by Binary Seach");
	        ispresent=true;
	        break;
	      }
	      else{
	         last = middle - 1 ;
	         middle = (first + last)/2;
	         ispresent=false;
	         }
	      
	   }
	   if (first == last && ispresent==false)
	      System.out.println(variable + " is not present in the list.\n ... searching done by binary search");
	 
	}
	
	public static int[] insertionSortInt(int [] a,int num){
		int i,x,n=a.length,j;
		for(i=1;i<=n-1;i++){
			x=a[i];
			j=i;
			while(j>=1 &&a[j-1]>x){
				a[j]=a[j-1];
				j--;
			}
			a[j]=x;
		}
		return a;
	}
	
	public static void  insertionSortString(String [] name){
		int n=name.length,i,j;
		String temp;
		for(i=0;i<n-1;i++){
			for(j=i+1;j<i;j++){
				if(name[i].compareTo(name[j])>0) {
					temp=name[i];
					name[i]=name[j];
					name[j]=temp;
				}
			}

		}
	}
	
	public static int[] BubbleSortInt(int [] array,int n){
		int i,j,temp;
		for(i=1;i<n-1;i++){
			for(j=1;j<=n-1;j++){
				if(array[j-1]>array[j]){
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
	
	
}
		
		
		
		
		
		
		
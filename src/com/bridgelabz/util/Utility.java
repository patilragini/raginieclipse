 /*  @author  Ragini Patil
 *  @version 1.0
 *  @since   28-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import java.awt.Container;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
import javax.lang.model.element.Element;
import javax.print.attribute.standard.RequestingUserName;

import java.io.File;
import java.io.FileNotFoundException;
/**
 * @author ragini
 *
 */


public class Utility {
	
	/**
	 * @param int n
	 * returntype void
	 */
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

	public static  void getcpn(int nRandoms){
		int randomCount = 1, randomNo, flag = 0, index = 1;
		int a[] = new int[nRandoms];
		a[0] = (int) (nRandoms * Math.random());
		while (index < nRandoms) {
			randomNo = (int) (Math.random() * nRandoms);
			randomCount++;
			for (int j = 0; j < index; j++) {
				if (a[j] == randomNo) {
					flag = 1;
				}
			}
			if (flag == 0) {
				a[index] = randomNo;
				index++;
			}
			flag = 0;
		}
		System.out.println(randomCount);
		for (int i : a) {
			System.out.println(i);
		}
	}
	 //function to check prime no
	/**@author ragini
	 * @param int n
	 * @return int number
	 **/
    public static int checkPrime(int n) {
   

    //condition to check if no less than two
    if (n < 2) { return 0;
    }
    
    //for loop to for checkin prime no
    for (int factor = 2; factor*factor <= n; factor++) {
       // if factor divides evenly into n, n is not prime, so break out of loop
       if (n % factor == 0) {
           return 0;
          
       }
    } // End of for loop
    return n;
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
	private String replace(String str) {
		// TODO Auto-generated method stub
		String nospace=str.replaceAll("\\s","");
		System.out.println(nospace);
		return nospace;
	}
	public static void anagramChecker(String str1,String str2){
		Utility u=new Utility();
		String s1 = u.replace(str1);  
        String s2 = u.replace(str2);  
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

	
	public static String ticTacToe() {
		boolean userTurn = false;
		int gameArray[][] = new int[3][3];
		int row, cols;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				gameArray[i][j] = -1;
			}
		}
		for (int k = 0; k < 9; k++) {

			if (userTurn) {
				userTurn(gameArray);
				userTurn = false;
				printGameArray(gameArray);
				if (checkWin(gameArray, 0)) {
					return "You Won";
				}

			} else {
				System.out.println("Computer's Turn");
				computerTurn(gameArray);
				userTurn = true;
				printGameArray(gameArray);
				if (checkWin(gameArray, 1)) {
					return "Computer Won";
				}

			}

		}

		return "Match Draw";
	}

	private static void printGameArray(int[][] gameArray) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (gameArray[i][j] == 0) {
					System.out.print("| X |");
				} else if (gameArray[i][j] == 1) {
					System.out.print("| O |");
				} else {
					System.out.print("|   |");
				}
			}
			System.out.println();
			System.out.println("===============");
		}

	}

	private static void computerTurn(int[][] gameArray) {

		Random random = new Random();
		int row = random.nextInt(3);
		int cols = random.nextInt(3);
		if (isValidTurn(gameArray, row, cols)) {
			gameArray[row][cols] = 1;
		} else {
			computerTurn(gameArray);
		}

	}

	private static boolean checkWin(int[][] gameArray, int i) {
		for (int j = 0; j < 3; j++) {
			if (gameArray[j][0] == i && gameArray[j][1] == i
					&& gameArray[j][2] == i) {
				return true;
			}
			if (gameArray[0][j] == i && gameArray[1][j] == i
					&& gameArray[2][j] == i) {
				return true;
			}
		}
		if (gameArray[0][0] == i && gameArray[1][1] == i
				&& gameArray[2][2] == i) {
			return true;
		}
		if (gameArray[0][2] == i && gameArray[1][1] == i
				&& gameArray[2][0] == i) {
			return true;
		}
		return false;
	}

	private static void userTurn(int[][] gameArray) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Your Turn....");
		System.out.println("Enter Position");
		System.out.print("Row=");
		int row = sc.nextInt() - 1;
		System.out.print("Column=");
		int cols = sc.nextInt() - 1;
		if (isValidTurn(gameArray, row, cols)) {
			gameArray[row][cols] = 0;
		} else {
			userTurn(gameArray);
		}

	}

	private static boolean isValidTurn(int[][] gameArray, int row, int cols) {
		if (gameArray[row][cols] == -1) {
			return true;
		}
		return false;
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
	
	public static <E> ArrayList<E> generateArray(int size,int choice){
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		 for(int i=0;i<size;i++){
			 arr.add(scan.nextInt());
		 }
		 System.out.println(arr);
		return null;
		
	}
	
	//2 C ARRAY CREATION GENERIC INT DOUBLE BOOLEAN 
	
	@SuppressWarnings("unchecked")
	public static <T> T arrayCreateGenericTwoDim(int row, int coloumn, int choose) {
		ArrayList<ArrayList<T>> twoDArray = new ArrayList<ArrayList<T>>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < row; i++)
			twoDArray.add(new ArrayList<T>());
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++)
				if (choose == 1)
					twoDArray.get(i).add((T) Integer.valueOf(scan.nextInt()));
				else if (choose == 2)
					twoDArray.get(i).add((T) Double.valueOf(scan.nextDouble()));
				else
					twoDArray.get(i).add((T) Boolean.valueOf(scan.nextBoolean()));
		}
		return (T) twoDArray;
	}
	
	///generic code of 2 d array display
	public static <generic> void arrayDisplayTwoDimGeneric(int row, int coloumn,ArrayList<ArrayList<generic>> array) {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < coloumn; j++){
					System.out.format("%2d ", array.get(i).get(j));
				}
				System.out.println();
		}
}
	
	///generic code of 1 d array display
	public static <generic> void arrayDisplayOneDimGeneric(ArrayList<ArrayList<generic>> array,int size) {
				for (int i = 0; i < size; i++) {
				System.out.format("%2d ", array.get(i));
				System.out.println();
			}
	}
	
	public static <T extends Iterable<T>> void arrayDisplayOneDimGeneric1(T[] list) {
			for (Object element : list){
	            System.out.println(element);
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
	
	/********
	 * 
	 * @param array , element
	 * @param 
	 * @return isPresent boolean
	 */
	public static <T extends Comparable<T>>boolean binarySearchGeneric(T arr[], T str) {
		int low = 0;
		boolean isPresent = false;
		int high = arr.length - 1;
		int mid = high / 2;
		while (high >= low) {
			if (arr[mid].compareTo(str)==0) {
				isPresent = true;
				break;
			} else if (arr[mid].compareTo(str) < 0) {
				low = mid + 1;
				mid = (low + high) / 2;
			} else if (arr[mid].compareTo(str) > 0) {
				high = mid - 1;
				mid = (low + high) / 2;
			}
		}
		return isPresent;
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
	
	public <T extends Comparable<T>> void doInsertionSort(T[] input) {
	        if (input == null) {
	            throw new RuntimeException("Input array cannot be null");
	        }
	        int length = input.length;
	      
	        if (length == 1) return;
	        int i,j;
	        T temp;
	        for (i = 1; i < length; i++) {
	            //Store the current element
	            temp = input[i]; 
	        /*    Compare the current element with  the partially sorted group
	            to see if its in the correct position */
	            for (j = i; (j > 0 && (temp.compareTo(input[j-1]) < 0)); j--){
	               /* The current element is not in its correct position in the partially sorted list.
	                Move the larger item one place to right and make space for the current element*/
	                input[j] = input[j-1];
	            }            
	            /*Found the correct position for the current element
	            in the partially sorted group. 
	            So move it to its correct place.*/
	            input[j] = temp;
	        }
	 }	    
		 
	public static <T> void doBubbleSortGeneric(T[] unsorted) {
		        for(int i =1; i< unsorted.length; i++){
		            for(int inner = 0; inner < (unsorted.length - i); inner ++){
		                if((((Comparable) (unsorted[inner])).compareTo(unsorted[inner+1])) > 0){
		                    T tmp = unsorted[inner];
		                    unsorted[inner] = unsorted[inner + 1];
		                    unsorted[inner + 1] = tmp;
		                }                
		            }
		        }
			
		 }    
	
	public static <T> void printArray(T[] input) {
	        for(T elem: input) {
	            System.out.print(elem);
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
		
	public static void binarySearchPredict(int left,int right) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("is guessed number between "+left+"-"+right);
		char check=input.next().charAt(0);
		int middle=right;
		int mid=middle;
		 middle = (left + right)/2;
		 System.out.println("is guessed number betweenSBHJFDJKNDKMD"+check);
		if( check== 'y'){
			System.out.println("is guessed number between "+left+"-"+right+":left l \n or\n"+(right+1)+" to "+mid+"right r");
			check=input.next().charAt(0);
			if(check=='l'){
				mid=(left+right)/2;
				binarySearchPredict(left,middle);
			}
			else if(check=='r'){
				mid=((mid+1)+right)/2;
			binarySearchPredict(right,middle+1);
			}
		}
		else  System.out.println("exit");
	}

	public static ArrayList<String> getFile() throws IOException {
	File f = new File("/home/bridgeit/Desktop/cities.txt");
	ArrayList<String> lines = get_arraylist_from_file(f);
		for(int x = 0; x < lines.size(); x++){
			System.out.println(lines.get(x));
	    }
        System.out.println("_______________sorting  list__________");
        Collections.sort(lines);
		return lines;
	    }
	
	public static void findWordFromFile(ArrayList<String> lines, String sc) {
	Utility u=new Utility();
		 /*if(lines.contains(sc)){
			 System.out.println("FOUND"); 
		 }
		 else
		 System.out.println("FOUND"); */
	String [] array = new String[lines.size()];
	lines.toArray(array);
	if (u.binarySearchGeneric(array,sc)==true) {
		System.out.println("String  is present");
	} else {
		System.out.println("String is not present");
	}
		
	}
		
//scan file till file has words add in list and send list back	
	public static ArrayList<String> get_arraylist_from_file(File f) 
        throws FileNotFoundException {
        Scanner s;
        ArrayList<String> list = new ArrayList<String>();
        s = new Scanner(f);
        while (s.hasNext()) {
            list.add(s.next());
        }
        s.close();
        return list;
    }
	
	public static void giveChange(int noteCounts[], int change, int pos) {
		int notes[] = { 1000, 500, 100, 50, 10, 2, 1 };
		if (pos < notes.length) {
			if (change < notes[pos]) {
				giveChange(noteCounts, change, ++pos);
			} else {
				change = change - notes[pos];
				noteCounts[pos]++;
				giveChange(noteCounts, change, pos);
			}
		}
	}

	/**
	 * @param no parameter 
	 * @return return long start Time
	 *
	 */
	
	public static long 	startStopWatch() {
		// TODO Auto-generated method stub
		 startTime = System.currentTimeMillis();
		 return startTime;
	}
	 public static long startTime,stopTime;
/**
 * 
 * @param startTime
 * @return elapsed time i.e stopTime - startTime
 */
    public static long elapsedTime(long startTime) {
        stopTime = System.currentTimeMillis();
        return (stopTime - startTime);
    }

    public static String[] mergeSort(String[] arr) {
		String firstArray[] = new String[arr.length / 2];
		String secondArray[] = new String[arr.length - (arr.length / 2)];
		int j = 0;
		if (arr.length == 1) {
			return arr;
		}
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = arr[i];
		}
		for (int i = firstArray.length; i < arr.length; i++) {
			secondArray[j] = arr[i];
			j++;
		}
		firstArray = mergeSort(firstArray);
		secondArray = mergeSort(secondArray);
		String[] returnArray = new String[arr.length];
		int firstIndex = 0, secondIndex = 0;
		for (int i = 0; i < returnArray.length; i++) {
			if (secondIndex == secondArray.length) {
				returnArray[i] = firstArray[firstIndex];
				firstIndex++;
			} else if (firstIndex == firstArray.length) {
				returnArray[i] = secondArray[secondIndex];
				secondIndex++;
			} else if (firstArray[firstIndex]
					.compareTo(secondArray[secondIndex]) > 0) {
				returnArray[i] = secondArray[secondIndex];
				secondIndex++;
			} else {
				returnArray[i] = firstArray[firstIndex];
				firstIndex++;
			}
		}

		return returnArray;

	}
/**
 * 
 * @param int first,int last
 * @return 
 * find guessed Number
 */
	public static void guessNumber(int first, int last) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//binary logic
		int middle = (first + last) / 2;
		if (first < last) {
			System.out.println("Is your number between " + first + " and "
					+ middle + " [y/n]:");
			char choice = sc.next().charAt(0);
			if (choice == 'y' || choice == 'Y') {
				guessNumber(first, middle);

			} else {
				guessNumber(middle + 1, last);
			}
		} else if (first == last) {
			System.out.println("Number is " + last);
		}
		sc.close();
	}

	/**
	 * @param int n
	 * return void
	 * convert integer number to binary
	 * calculate sum of binary array
	 * @return binary ArrayList
	 */
	public static ArrayList toBinary(int n){
		int power = 1;
		
		int ctr=0;
		ArrayList array = new ArrayList(32);
		for(int i=0;i<32;i++){
	        	array.add(0);
	        }

		while (power <= n/2) {
	            power *= 2;
	        }
	        // check for presence of powers of 2 in n, from largest to smarraylest
	        while (power > 0) {
	            // power is not present in n //power will be 1 2 4 8 
	            if (n < power) {
	            	
	                System.out.print(0);
	                array.remove(0);
	               array.add(0);	               
	            }
	            // power is present in n, so subtract power from n
	            else {
	                System.out.print(1);
	                n -= power;
	               array.add(1);	             
	            }
	            // next smarraylest power of 2
	            power /= 2;
	        }
	       
	 
	        System.out.println(array);
	        /*
	      	we do not get equivalent binary in array list so reverse arrayList
	    	 * because 2pow0 is given to highest position 
	    	 * 2pow0 starts for lowest position
	    	 **/
	    	Collections.reverse(array);
	    	System.out.println("reversed array"+array);
	    	int size=array.size();
	        int low=0;
	    	int high=(array.size())-1;
	    	int sum=Utility.getSumNibble(array);
	    	System.out.println("sum before swap="+sum);
	      return array;
	}
	/**
	 * 
	 * @param arrayList array
	 * 
	 */
	public static void swapNibbles(ArrayList array) {
	// TODO Auto-generated method stub
		
	int size=(array.size());
	int low=0;
	int high=(array.size())-1;
	int mid=(low+high)/2;
	int total,numh,numl;
	ArrayList arrswap = new ArrayList(size);
	ArrayList arrnh = new ArrayList(size);
	ArrayList arrnl = new ArrayList(size);
	System.out.println("_______mid  ="+mid);
	arrnl=Utility.getNibble(array,mid+1,high);
	arrnh=Utility.getNibble(array,low,mid);
	arrswap.addAll(arrnl);
	arrswap.addAll(arrnh);
	System.out.println("new swap array ="+arrswap);
	total=getSumNibble(arrswap);
	System.out.println("total after swap "+total);
		
}
/**
 * 
 * @param array having binary values

 * @param low
 * @param mid
 * @return total (eg 01000110 which is 70 in decimal.)
 * return 70
 * @author ragini
 */
	public static ArrayList  getNibble(ArrayList array,int a, int b) {
	ArrayList arr = new ArrayList(b);
	int retval;
	int sum=0;
	for(int i=a;i<=b;i++){
		retval=(int) array.get(i);
		arr.add(retval);
	}
	System.out.println(arr);
	
	sum=Utility.getSumNibble(arr);
	return arr;
	}
	public static int getSumNibble(ArrayList array) {
		int retval;
		int sum=0;
		for(int i=0;i<=array.size()-1;i++){
			retval=(int) array.get(i);
				if(retval==1){
				sum=sum +(int) (Math.pow(2,i));
			}
				
		}
			return sum;
	}
    //Static function that calculate the date falls on
    
}
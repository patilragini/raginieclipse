package com.bridgelabz.programs;

import com.bridgelabz.util.Utility;

public class Factorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
        System.out.print("The prime factorization of " + n + " is : 1 ");
        Utility.factorization(n);
	}

}

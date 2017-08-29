package com.bridgelabz.programs;
import java.util.Scanner;
import com.bridgelabz.util.Utility;

public class PrintUsername {
	private static Scanner n;
	public static void main(String[] args) {
	n=new Scanner(System.in);
	String name=n.next();
	Utility.printUsername(name);
	}
}
package com.bridgelabz.programs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import com.bridgelabz.util.Utility;

public class SearchWordFromFile {
    public static void main(String[] args) throws IOException {
    	System.out.println("GVYHGV");
    	ArrayList<String> list = new ArrayList<String>();
    	Scanner sc=new Scanner(System.in);
    	list=Utility.getFile();
    	System.out.println("ENTER WORD TO SEARCH FROM FILE");
    	 String word=sc.next();
    	Utility.findWordFromFile(list,word);
    	sc.close();
    }
    
}
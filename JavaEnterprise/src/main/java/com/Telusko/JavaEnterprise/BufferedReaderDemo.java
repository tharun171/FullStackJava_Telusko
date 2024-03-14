package com.Telusko.JavaEnterprise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(in);
		
		System.out.println("Enter a number");
		//bf.readLine() - takes string by defaulr
		int num = Integer.parseInt(bf.readLine());
		System.out.println(num);
		
		
		in.close();
		bf.close(); 
		
		
	}

}

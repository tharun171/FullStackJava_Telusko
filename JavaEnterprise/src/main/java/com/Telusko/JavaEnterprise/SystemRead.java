package com.Telusko.JavaEnterprise;

import java.io.IOException;

public class SystemRead {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		try {
			int num = System.in.read();
			//gives the Ascii value of given input
			//System.out.println(num);
			/*
			 * A 65
			 */
			//To get same number we are giving input
			//it can take only one char as input 0-9
			System.out.println(num-48);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}

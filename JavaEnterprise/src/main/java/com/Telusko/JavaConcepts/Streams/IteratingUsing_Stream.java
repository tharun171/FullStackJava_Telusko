package com.Telusko.JavaConcepts.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;



public class IteratingUsing_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print first 20 numbers
		//print even numbers upto 20
		
		//Filter method
		List<Integer> nums = Arrays.asList(43,23,43,12,2,4,34,56,32);
				
				
		//adding all even numbers
		int result = nums.stream()
				.filter(ele -> ele%2==0)
				.map(ele -> ele)
				.reduce(0,(a,b)->a+b);
		System.out.println("sum of even numbers "+result);
		
		/*
		Stream
		.iterate(1,ele->ele+1)
		.map(ele->ele)
		.filter(ele -> ele%2==0 && ele<21)
		.forEach(ele -> System.out.print(ele+" "));
		*/
		
		
	
	}
}

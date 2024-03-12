package com.Telusko.JavaConcepts.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList size is 10000
		List<Integer> nums = new ArrayList<Integer>(10000);
		
		//have deafulr 10000 0's in nums
		Random ran = new Random();
		
		for(int i=1;i<=10000;i++)
		{
			nums.add(ran.nextInt(100));
		}
		
		
		//multiply every value by 2 and add all them
		//find the total value
		long start = System.currentTimeMillis();
		Integer total = nums
				.stream()
				.map(ele -> ele*2)
				.reduce(0,(a,b)->a+b);
		System.out.println("add all after multiply by 2 "+total);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		long start1 = System.currentTimeMillis();
		Integer total1 = nums
				.stream()
				.map(ele -> ele*2)
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("map to int "+total1);
		long end1 = System.currentTimeMillis();
		System.out.println(end1-start1);
		
		//Parallel Stream
		//uses multiple threads (time will be less when we use this)
		//i am getting more  due to system problem maybe
		long start2 = System.currentTimeMillis();
		Integer total2 = nums
				.parallelStream()
				.map(ele -> ele*2)
				.mapToInt(ele -> ele)
				.sum();
		System.out.println("using parallel stream  "+total2);
		long end2 = System.currentTimeMillis();
		System.out.println(end2-start2);
	
	
	}

}

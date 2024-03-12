package com.Telusko.JavaConcepts.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <Integer> list = 
				new ArrayList<Integer>(Arrays.asList(10,20,33,2,10,34,54,33,23,21));

		System.out.println(list);
		
		//Using stream to iterate
		List<Integer> list1 = list
				.stream()
				.map(ele->ele)
				.collect(Collectors.toList());
		System.out.println("list1 "+list1);
		
		//Get min ele from List
		Integer minNum = list
				.stream()
				.min((num1,num2) -> (num1>num2)?1:-1)
				.get();
		System.out.println("minimum in list : "+minNum);
		
		//Get Max ele from List
		Integer maxNum = list
				.stream()
				.max((num1,num2)->(num1>num2)?1:-1)
				.get();
		System.out.println("maximum in list "+maxNum);
		
		// count number if elements in list
		Integer count = (int) list
				.stream()
				.map(ele->ele)
				.count();
		System.out.println("number of elements in list :"+count);
		
		//Sum of all ele in list
		Integer sumList = list
				.stream()		//this will be stored in one stream
				.map(ele->ele)	//this will be strored in one stream 
				//no need of mentioning sum only
				.reduce((int) 0.0f,(sum,ele)->sum+ele);
		System.out.println("sum of list "+sumList);
	
		Integer SumListt = list
				.stream()
				.map(ele -> ele)
				.reduce(0,(a,b)->a+b);
		System.out.println("added sumListt method "+SumListt);
		
		
		
		//Sum method 2
		Integer sumList1 = (int) list
				.stream()
				.collect(Collectors.summarizingInt(ele->ele))
				.getSum();
		System.out.println("Sum method 1 "+sumList1);
	
		//sum methos 3
		Integer sumList2 = (int)list
				.stream()
				.map(ele->ele)
				.reduce(0,Integer::sum);
		//for float
		//.reduce(0.0f,Float::sum);
		System.out.println("sum method 2 "+sumList2);
		
		//get only first 2 ele in list
		List<Integer> list2 = list
				.stream()
				.map(ele->ele)
				.limit(2)
				.collect(Collectors.toList());
		System.out.println("first 2 ele "+list2);
		
		
		//sort list in ascending
		List<Integer> sortedAsc = list
				.stream()
				.map(ele->ele)
				.sorted()
				.toList();
		System.out.println("Ascending "+sortedAsc);
	
		//sort list in descending
		List<Integer> sortedDes = list
				.stream()
				.map(ele->ele)
				.sorted(Collections.reverseOrder())
				.toList();
		System.out.println("Ascending "+sortedDes);
	
		//forEach method to iterate
		System.out.println("iterating using for each");
		list.forEach(ele -> System.out.print(ele+" "));
		System.out.println();
		
		//printing, iterate elements in order specified by stream
		System.out.println("Iterating using forEachOrdered");
		list.stream().forEachOrdered((ele)->System.out.print(ele+" "));
		System.out.println();
		
		//filter elements less than 30
		List<Integer> list3 = list
				.stream()
				.map(ele->ele)
				.filter(ele -> ele<30)
				.collect(Collectors.toList());
		System.out.println("elements less than 30 "+list3);
		
		//count of elements less than 30
		Integer countEleLess30 = (int)list
				.stream().map(ele->ele)
				.filter(ele -> ele<30)
				.count();
		System.out.println("count of elements less than 30 are : "+countEleLess30);
		
		//elements in range 30 to 40
		List<Integer> list4 = list
				.stream()
				.map(ele->ele)
				.filter(ele -> ele>30 && ele<40)
				.collect(Collectors.toList());
		System.out.println("range 30 to 40 "+list4);
		
		//get even numbers from list
		List<Integer> list5 = list
				.stream()
				.map(ele ->  ele)
				.filter(ele -> ele%2==0)
				.collect(Collectors.toList());
		System.out.println("even numbers "+list5);
	
		
		//get Disticnt elements from list
		//10 and 33 repeated twice
		System.out.println("original list "+list);
		List<Integer> getDistinctElements = 
				list
				.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println("removed repetitive numbers "+getDistinctElements);
		
		
			
	}
}

package com.Telusko.JavaConcepts.Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_ArrayList_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("apple","banana","orange");
		
		//getting every word length
		//Map method
		List<Integer> list1 = list
				.stream()
				.map(String::length)
				.collect(Collectors.toList());
		System.out.println(list1);
		
		//flatMap
		//flattens nested collections or maps
		List<List<Integer>> nestedList = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(4, 5, 6),
			    Arrays.asList(7, 8, 9)
			);
		
		List<Integer> flatList = nestedList
				.stream()
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
		System.out.println(flatList);

	}

}

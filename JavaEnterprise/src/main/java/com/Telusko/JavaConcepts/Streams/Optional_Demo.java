package com.Telusko.JavaConcepts.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> names = Arrays.asList("avin","laura","perry","kishu");
		
		Optional<String> name = names
				.stream()
				.filter(ele -> ele.contains("a"))
				.findFirst();
				//.orElse("noName");	//if this is there, datatype is String
		
		//optional gives these
		//if nothing found, we can send something
		System.out.println(name.orElse("noName"));
		
		//converting optional to String
		String getName = name.get();
		System.out.println(getName);
		
		
		/*
		 * Convert all to uppercase
		 */
		List<String> upperCase = names
				.stream()
				.map(nam -> nam.toUpperCase())
				.toList();
		System.out.println(upperCase);
		
		//Method reference
		List<String> upperCase1 = names
				.stream()
				.map(String::toUpperCase)
				.toList();
		System.out.println(upperCase1);
		
		//sorted
		List<String> sorted = names
				.stream()
				.sorted()
				.toList();
		System.out.println(sorted);
	}

}

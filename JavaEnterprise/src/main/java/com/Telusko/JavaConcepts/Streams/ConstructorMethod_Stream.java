package com.Telusko.JavaConcepts.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student
{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student(String name) {
		super();
		this.name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}


public class ConstructorMethod_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("navin","richa","smirit","smith");
		
		List<Student> list = new ArrayList<Student>();
		
		/*
		for(String name:names)
		{
			list.add(new Student(name));
		}
		*/
		
		
		//using stream api
		/*
		list = names
				.stream()
				.map(ele -> new Student(ele))
				.toList();
			*/
		
		//using constructor reference
		list = names
				.stream()
				.map(Student::new)
				.toList();
		
		System.out.println(list);

	}

}

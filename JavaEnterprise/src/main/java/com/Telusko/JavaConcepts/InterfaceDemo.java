package com.Telusko.JavaConcepts;

interface Bat
{
	//by default all the methods are
	//public abstract by default
		void show();
		void config();
	//can we declare variables
		//by default final and static
		int age = 44;
		String area = "mumbai";
}

class Cat implements Bat
{
	//@Override
	public void show() {
		System.out.println("in show");
	}

	//@Override
	public void config() {
		System.out.println("in conmfig");
	}
} 

//class extends abstract class
//class implements interface
//interface extends interface1,interface2

public class InterfaceDemo {
	public static void main(String[] args)
	{
		Cat c = new Cat();
		c.show();
		c.config();
		
		//getting variables
		System.out.println(Bat.age);
		System.out.println(Bat.area);
		
		//final fields cannot be modified
		//if we try, it throws error
		
	}
}

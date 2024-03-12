package com.Telusko.JavaEnterprise;

//this will act as functional interface
//coz it has one method only
interface ClassA
{
	//are default abstract methods
	void func1();
}


class ClassB implements ClassA
{

	@Override
	public void func1() {
		System.out.println("implementaion func1 ClassB");
	}
	
}

public class Functional_Interface_Demo {

	public static void main(String[] args) {
		
		//Functional interface
		//Functional interface contains only one method

		ClassB var1 = new ClassB();
		var1.func1();
		
		//var2 has type ClassA
		//implementation of ClassB
		ClassA var2 = new ClassB();
		var2.func1();
		
		//Anonymous = using interface class
		ClassA var3 = new ClassA()
				{
					@Override
					public void func1() {
						System.out.println("anonymous implementation using interface");
					}
				};
		var3.func1();
		
		
		//can only use lambda exp using functional interface
		//instead of doing like above
		ClassA var4 = () ->
		{
			System.out.println("body of functional interface method");
		};
		var4.func1();
		
	}

}

package com.Telusko.JavaConcepts;


class A
{
	int age;
	public void show()
	{
		System.out.println("in show");
	}
	class B
	{
		public void config()
		{
			System.out.println("in config B");
		}
	}
	static class C
	{
		public void config()
		{
			System.out.println("in Class c");
		}
	}
}



public class InnerClass {

	//can be used when the main class here
	//only uses it and outside classes 
	//doesnot need it
	
	public static void main(String[] args)
	{
		//System.out.println("in inner class");
		
		A obj1 = new A();
		obj1.show();
		
		//To access B class
		A.B obj2 = obj1.new B();
		obj2.config();
		
		//works only if innner class is static class
		//outer class cannot be static
		A.C obj3 = new A.C();
		obj3.config();
		
	}
}

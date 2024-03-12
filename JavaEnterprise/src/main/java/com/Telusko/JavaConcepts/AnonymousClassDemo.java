package com.Telusko.JavaConcepts;

import com.Telusko.JavaConcepts.A.B;

abstract class apple
{
	abstract void show1();
}


public class AnonymousClassDemo {

	public static void main(String[] args)
	{
		//This is an anonymous class
		A obj1 = new A()
			{
				public void show()
				{						System.out.println("in A show");
			}
			};
			
		obj1.show();
		
		
		//Getting abstract class
		//giving its implementation in Anonymous class
		//can be used like this, when we use it only once
		apple obj2 = new apple()
		{

			//@Override
			void show1() {
				System.out.println("apple show method");
			}
			
		};
		
		obj2.show1();
		
	}
}

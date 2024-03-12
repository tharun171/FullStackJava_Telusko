package com.Telusko.JavaConcepts;

//by default its like a class
//so can be instantiated
enum status
{
	//These are named constants
	Running,Failed,Pending,Success;
}

public class EnumDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		status s;
		//s = status.Running;
		s = status.Failed;
		System.out.println(s);
		
		//get All status
		status[] s1 = status.values();
		System.out.println(s1);
		for(status var:s1)
		{
			System.out.println(var);
		}
		
		//comparing status
		if(s== status.Running)
		{
			System.out.println("it is running");
		}
		else if(s==status.Pending)
		{
			System.out.println("its pending");
		}
		else
		{
			System.out.println("other two");
		}
		
		//using switch
		switch(s)
		{
			case Running:
			{
				System.out.println("it is running");
				break;
			}
			case Success:
			{
				System.out.println("it is success");
				break;
			}
			default:
			{
				System.out.println("other two");
				break;
			}
		}
	}
}

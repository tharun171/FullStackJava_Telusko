package com.Telusko.JavaEnterprise.Threads;

class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("hi "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("hello "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj1 = new A();
		B obj2 = new B();
		
		//normal execution
		//uses thread and after obj1 does the job
		//obj2 starts executing
		//obj1.show();
		//obj2.show();
		
		//when i want parallel execution
		//converting class to thread
		// just extend the class with thread
		/*
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		*/
		//both runs simultaneously
		//threads uses thread scheduler
		//scheduler allows which thread to run
		/*
		t1.start();
		t2.start();
		*/
		
		//getting one after another
		//getting one hi after another
		Thread t3 = new Thread(obj1);
		Thread t4 = new Thread(obj2);
		System.out.println(t3.getPriority());
		System.out.println(t4.getPriority());
		//giving t4 low priority
		//so t3 runs first
		t3.start();
		//min priority is 1
		t4.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t4.getPriority());
		t4.start();
		
	}

}

package com.Telusko.JavaEnterprise.Threads;

class Counter
{
	int count = 0;
	public synchronized void increment()
	{
		count++;
	}
}

public class Thread_Join_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Counter c = new Counter();
		Runnable obj1 = () ->
		{
			for(int i=1;i<=1000;i++)
			{
				c.increment();
			}
		};
		
		Runnable obj2 = () ->
		{
			for(int i=1;i<=1000;i++)
			{
				c.increment();
			}
		};
		
		//when both threads execute,
		//we expect count to be 2000
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		/*
		t1.start();
		t2.start();
		*/
		
		//gives 0 and all as output
		//coz while executing only it prints count
		//System.out.println(c.count);
		
		//join() method
		//second thread runs after first stops
		
		//if we dont follow the order
		//we need to mention --> synchronized <-- in method
		/*
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		*/
		
		//without syncronixed keyword in method we get wrong values
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		//after t1 and t2 completes their execution
		//prints count
		System.out.println("count "+c.count);
				
	}

}

package com.Telusko.JavaEnterprise.Threads;

class ClassB implements Runnable
{
	public void run() {
		for(int i=1;i<=10;i++)
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

public class ThreadRunnable_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable obj1 = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1;i<=10;i++)
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
		};
		
		
		//using lambda
		//as Runnable is a functional interface
		Runnable obj3 = () ->
		{
				for(int i=1;i<=10;i++)
				{
					System.out.println("hello "+i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		};
		
		Runnable obj2 = new ClassB();
		
		//simultaneously executed
		//once t1 executed, t2 begins
		//to avoid this add Thread.sleep in both methods
		//Thread t1 = new Thread(obj1);
		//or
		Thread t1 = new Thread(obj3);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}
}

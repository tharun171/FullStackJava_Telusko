package com.Telusko.JavaConcepts;


abstract class car
{
	public void drive()
	{
		System.out.println("can drive");
	}
	
	abstract void fly();
	abstract void playmusic();
}

abstract class benz extends car
{
	//what if i dont want fly method
	//give this class abstract

	//@Override
	void playmusic() {
		System.out.println("playing music");
	}
}

class updatedBenz extends benz
{
	//@Override
	void fly() {
		System.out.println("can fly");
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car c = new updatedBenz();
		c.playmusic();
		c.drive();
		c.fly();
	}

}

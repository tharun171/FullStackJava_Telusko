package com.Telusko.JavaConcepts;


enum Laptops
{
	//giving price
	Macbook(2000),Xps(2200),Surface(1500),Thinkpad(1800),vivobook;
	
	//for vivobook did not gave price
	//by default, we need to give price as 1000
	//this assign price by default is 1000
	private Laptops()
	{
		price = 1000;
	}

	private int price;

	//constructor
	//this initialize values to laptops
	private Laptops(int price) {
		this.price = price;
		System.out.println("in Laptop class "+this.name());
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

public class EnumDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptops lap = Laptops.Macbook;
		System.out.println(lap);
		System.out.println(lap.getPrice());
		
		for(Laptops lapVar:Laptops.values())
		{
			System.out.println(lapVar+" "+lapVar.getPrice());
		}
		
	}

}

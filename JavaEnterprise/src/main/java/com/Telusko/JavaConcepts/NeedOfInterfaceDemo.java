package com.Telusko.JavaConcepts;

interface computer
{
	void code();
}
class laptop implements computer
{
	public void code() {
		System.out.println("code compile run");
	}
}
class Desktop implements computer
{
	public void code()
	{
		System.out.println("code compile run Faster");
	}
}
class developer
{
	public void giveLaptop(computer comp)
	{
		//based on given comp, it will run
		//both laptop and desktop got implementation from computer
		comp.code();
	}
}
public class NeedOfInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//we are having a company
		//developers are given either a lap or comp to code
		
		//laptop variable have reference tyoe computer
		//has implementation laptop
		computer laptop = new laptop();
		computer desktop = new Desktop();
		
		developer dev1 = new developer();
		System.out.println("dev1 gets");
		dev1.giveLaptop(laptop);
		
		developer dev2 = new developer();
		System.out.println("dev2 gets");
		dev2.giveLaptop(desktop);
		
	}

}

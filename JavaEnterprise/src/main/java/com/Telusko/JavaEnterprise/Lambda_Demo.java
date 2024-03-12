package com.Telusko.JavaEnterprise;

interface ClassC
{
	void func2(int a);
}

//multiple variables diff datatTypes
interface ClassD
{
	void func3(int a,String b,double c);
}

//return methods
interface ClassE
{
	int func4(int a,int b);
}

public class Lambda_Demo {

	public static void main(String[] args) {

		//lambda expressions work with functional interface
		ClassC var3  = (int a) ->
		{
			System.out.println("in method "+a);
		};
		var3.func2(5);
		
		ClassC varr3 = a -> System.out.println("in method single parameter "+a);
		varr3.func2(10);
		
		//using anonymous
		ClassC var4 = new ClassC()
				{
					@Override
					public void func2(int a) {
						System.out.println("in anonymous method "+a);
					}
				};
		var4.func2(10);
		
		ClassD var5 = (int a,String b,double c) ->
		{
			System.out.println(a+" : "+b+" : "+c);
		};
		var5.func3(10,"tharun",9.5);
		
		/*
		ClassD var6 = (int a,double b,String c) ->
		{
			
		}
		*/
		//above doesnt work, coz parameter ordering is not same
		
		//return
		ClassE var6 = (int a,int b) ->
		{
			System.out.println(a+" "+b);
			return a+b;
		};
		System.out.println(var6.func4(3,4));
		
		
		
	}

}

package com.Telusko.JavaEnterprise;


class VoterAgeNotValid extends Exception
{
	public VoterAgeNotValid(String string)
	{
		//System.out.println(string);
		//or use
		super(string);
		System.out.println("age less than 18 not allowed to vote");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}

public class CustomExceptionDemo {

	public static void main(String[] args) {
		
		int age = 17;
		
		try
		{
			if(age<18)
				throw new VoterAgeNotValid("age not valid");
		}
		catch(VoterAgeNotValid e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("done");
	}

}

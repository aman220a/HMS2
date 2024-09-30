package Testng;

import org.testng.annotations.Test;

public class Innovaction {

	@Test(invocationCount=5)
	public void count()
	{
		System.out.println("Hello World");
	}
	
	@Test
	public void count1()
	{
		System.out.println("Hello India");
	}
}

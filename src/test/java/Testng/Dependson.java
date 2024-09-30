package Testng;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Dependson {

	@Test(dependsOnMethods = {"test2","test3"})
	public void test1()
	{
		System.out.println("This is test method 1");
	}
	
	@Test(description = "This is main method")
	public void test2()
	{
		System.out.println("This is test method 2");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test3()
	{
		System.out.println("This is test method 3");
	}


}

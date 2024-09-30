package Testng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.SkipException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Main {

	
	@Test
	public void test1()
	{
		System.out.println("This is test method 1");
		AssertJUnit.assertTrue(true);
	}
	
	@Test
	public void test2()
	{
		System.out.println("This is test method 2");
		AssertJUnit.assertTrue(false);
	}
	
	@Test
	public void test3()
	{
		System.out.println("This is test method 3");
		throw new SkipException("skip method");
	}
	
	
}

package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	
	@Test
	@BeforeSuite
	public void test1()
	{
		System.out.println("This is suite");
		
	}
	
	@Test
	@BeforeTest
	public void test2()
	{
		System.out.println("This is test");
	}
	
	@BeforeClass
	public void test3()
	{
		System.out.println("This is class");
	}
	
	@Test
	@BeforeMethod
	public void test4()
	{
		System.out.println("This is before method");
	}
	
	@Test
	public void test5()
	{
		System.out.println("This is Test method");
	}
	
	@Test
	@AfterMethod
	public void test6()
	{
		System.out.println("This is After method");
	}
	
	@AfterClass
	public void test7()
	{
		System.out.println("This is After class");
	}
	
	@Test
	@AfterTest
	public void test8()
	{
		System.out.println("This is After Test");
	}
	
	@Test
	@AfterSuite
	public void test9()
	{
		System.out.println("This is After Suite");
	}
	
}

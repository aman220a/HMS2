package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnotations {
	

	

	
	@Test(priority=0)
	public void test1()
	{
		System.out.println("This is test1");
	}
	
	@Test(priority=1)
	public void test2()
	{
		System.out.println("This is test2");
	}

	@Test(priority=2)
	public void test3()
	{
		System.out.println("This is test3");
	}
	
	
	

	
}

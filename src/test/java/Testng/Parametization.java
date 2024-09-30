package Testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametization {
    
	@Test
	@Parameters({"i","j"})
	public void add(int a,int b)
	{
		System.out.println("value of a and b:"+(a+b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void subtraction(int a,int b)
	{
		System.out.println("value of a and b:"+(a-b));
	}
	
	
}

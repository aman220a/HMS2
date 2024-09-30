package Testng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	WebDriver driver;
	
	@Test
	public void logintest()
	{
	
		  ChromeOptions options = new ChromeOptions();
		  
		    options.addArguments("--remote-allow-origins=*");
		
			driver = new ChromeDriver(options);
			
			driver.manage().window().maximize(); 
			
			driver.get("https://www.saucedemo.com/v1/index.html");
			
			String expectedtitle = "Swag Labs";
			
			String actualtitle = driver.getTitle();
			
			AssertJUnit.assertEquals(actualtitle, expectedtitle);
	}

	
	@Test
	public void verifylogo()
	{
		System.out.println("Logo matched");
	}
}

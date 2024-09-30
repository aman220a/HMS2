package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class AssertDemo {
	
	@Test
	public void testMethod()
	{
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize(); // Used to maximize the windows
		
		SoftAssert soft = new SoftAssert();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String expected = "Automation Testing Practice1";
		
		String actual = driver.getTitle();
		
		soft.assertEquals(expected, actual);
		
		// check the icon 
		
		System.out.println("Verify the icon is present on the web page or not");
		
		WebElement icon = driver.findElement(By.className("wikipedia-icon"));
		
		boolean b1 = icon.isDisplayed();
		
		soft.assertTrue(b1);
		
		soft.assertAll();
	}
	

}

package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.LoginPage;


public class TC_login {
		
	
        static WebDriver driver;

		@BeforeMethod
		public void setUp()
		{
			 ChromeOptions options = new ChromeOptions();
			    options.addArguments("--remote-allow-origins=*");
			
				driver = new ChromeDriver(options);
				
				driver.manage().window().maximize(); 
				
				driver.get("https://project1.qualibytes.com/backend/admin/index.php");
				
				
		}
		
		@Test
		public void logintest()
		{
			LoginPage pg = new LoginPage(driver);
			pg.setUsername("admin@mail.com");
			pg.setPassword("Password@123");
			pg.click();
			
			String expected = "Hospital Management System -A Super Responsive Information";
			
			String actual = driver.getTitle();
			
			Assert.assertEquals(actual, expected);
			
			System.out.println("Hello world");
			
		}
		

	}
	


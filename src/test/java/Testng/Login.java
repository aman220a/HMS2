package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void loginHRM()
	{
		  ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		
			WebDriver driver = new ChromeDriver(options);
			
			driver.manage().window().maximize(); 
			
			ReadConfig config = new ReadConfig();
			
			driver.get(config.getURL());
			
			driver.findElement(By.id("user-name")).sendKeys(config.getUserName());
			
			driver.findElement(By.id("password")).sendKeys(config.getPassword());
			
			driver.findElement(By.id("login-button")).click();
			
	}

}

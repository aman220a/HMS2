package Project.Session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		
			WebDriver driver = new ChromeDriver(options);
			
			driver.manage().window().maximize(); 
			
			driver.get("https://www.saucedemo.com/v1/index.html");
			
			WebElement element=driver.findElement(By.id("user-nam"));
			element.sendKeys("standard_user");
			
		     WebElement element2 = driver.findElement(By.name("password"));
		     element2.sendKeys("secret_sauce");
		     
			//driver.findElement(By.id("login-button")).click();
			
			
			
			//driver.findElement(By.linkText("Sign up for Facebook")).click();
			
		     //driver.findElement(By.partialLinkText("Backpack")).click();
			
			//driver.findElement(By.xpath("/html/body/header/nav/div/div[1]/a/img"));

		    // List<WebElement> elements = driver.findElements(By.tagName("an"));
		     
		     //System.out.println(elements.size());
			
			
		
	}

}

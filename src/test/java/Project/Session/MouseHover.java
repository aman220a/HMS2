package Project.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	
		WebDriver driver = new ChromeDriver(options);
		
	driver.manage().window().maximize(); 
		
		driver.get("https://demo.opencart.com/");
		
		WebElement Desktop = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a"));	
		
		WebElement Mac = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a"));
		
		Actions Act = new Actions(driver);
		
	    Act.moveToElement(Desktop).moveToElement(Mac).click().perform();
	}

}

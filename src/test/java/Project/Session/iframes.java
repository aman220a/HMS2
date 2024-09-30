package Project.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		
			WebDriver driver = new ChromeDriver(options);
			
			driver.manage().window().maximize(); 
			
			driver.get("https://www.rediff.com/");
			
			//switch to the frame with parametrs : id or name
			
			//driver.switchTo().frame("moneyiframe");
			
			//switch to the frame with parameters index
			
			//driver.switchTo().frame(0);
			
			
		    WebElement element = driver.findElement(By.id("moneyiframe"));
		
		      driver.switchTo().frame(element);	
		
			String nse = driver.findElement(By.id("nseindex")).getText();
			
			System.out.println(nse);
			
			
			driver.switchTo().defaultContent();
	}
	
	

}

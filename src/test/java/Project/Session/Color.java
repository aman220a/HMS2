package Project.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Colors;

public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		 ChromeOptions options = new ChromeOptions();
			
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(options);
			
			driver.manage().window().maximize();
			
			driver.get("https://blazedemo.com/");
			
			WebElement e = driver.findElement(By.xpath("/html/body/div[3]/form/div/input"));
			
		   String backcolor=e.getCssValue("background-color");
		
		   System.out.println(backcolor);
		   
		   
		     String BackGroundColor= org.openqa.selenium.support.Color.fromString(backcolor).asHex();
		     
		     System.out.println(BackGroundColor);
		     
		   
	}

}

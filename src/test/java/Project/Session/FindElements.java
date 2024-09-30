package Project.Session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		
			WebDriver driver = new ChromeDriver(options);
			
			driver.manage().window().maximize(); 
			
			driver.get("https://www.calculator.net/");
			
			List<WebElement> list = driver.findElements(By.tagName("an"));
			System.out.println(list.size());
	}

}

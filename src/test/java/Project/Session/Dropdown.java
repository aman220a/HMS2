package Project.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		
			WebDriver driver = new ChromeDriver(options);
			
			driver.manage().window().maximize(); 
			
			driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
			
			WebElement element = driver.findElement(By.id("day"));
			
			WebElement month = driver.findElement(By.id("month"));
			
			WebElement year = driver.findElement(By.id("year"));
			
			Select st = new Select(element);
			
			//st.selectByVisibleText("21");
			//st.selectByValue("31");
			
			Select st1 = new Select(month);
			//st1.selectByVisibleText("Mar");
			//st1.selectByValue("1");
			
			Select st2 = new Select(year);
			//st2.selectByVisibleText("1999");
			//st2.selectByValue("1990");
		
			
			
	}

}

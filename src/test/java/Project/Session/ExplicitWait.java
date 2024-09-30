package Project.Session;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	
		WebDriver driver = new ChromeDriver(options);
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(15)); // declaration
		
		driver.manage().window().maximize(); 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		WebElement txtusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	    txtusername.sendKeys("Admin");
		
	    
	     WebElement txtpassword =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	     txtpassword.sendKeys("admin123");
	     
	     WebElement txtclick = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
		 txtclick.click();
	}

}

package Project.Session;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize(); 
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement Button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		Actions Act1 = new Actions(driver);
		
		Act1.contextClick(Button).build().perform();
		
		WebElement click1 = driver.findElement(By.xpath("/html/body/ul/li[3]/span"));
		
		Thread.sleep(2000);
		
		click1.click();
		
		Thread.sleep(2000);
		
		
		driver.switchTo().alert().accept();	
		
		Thread.sleep(2000);
		}

}

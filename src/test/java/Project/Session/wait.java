package Project.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize(); 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");

		
	}

}

package Project.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		
			WebDriver driver = new ChromeDriver(options);
			
			driver.manage().window().maximize(); 
			
			driver.get("https://project1.qualibytes.com/backend/admin/index.php");
			
			driver.findElement(By.id("emailaddress")).sendKeys("admin@mail.com");
			
			driver.findElement(By.id("password")).sendKeys("Password@123");
			
			driver.findElement(By.name("admin_login")).click();			
		
		
	}

}

package Project.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize(); 
		
		driver.get("https://demo.opencart.com/admin/index.php");
		
	
		driver.findElement(By.name("username")).sendKeys("demo");
		
		
		driver.findElement(By.name("password")).sendKeys("demo");
		
		driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
		
		driver.switchTo().alert().accept();
		
	}

}

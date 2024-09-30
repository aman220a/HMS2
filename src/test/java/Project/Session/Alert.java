package Project.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
		
		  ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		
			WebDriver driver = new ChromeDriver(options);
			
			driver.manage().window().maximize(); 
			
			driver.get("https://demo.automationtesting.in/Alerts.html");
			
			
		//	Thread.sleep(5000);
			
	        driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
	        
	        Thread.sleep(3000);
	        
	       String s =  driver.switchTo().alert().getText();
	       
	       System.out.println(s);
	        
	        driver.switchTo().alert().accept();
	        
	      	
			
	
	}

}

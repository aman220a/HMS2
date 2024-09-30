package Project.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		
			WebDriver driver = new ChromeDriver(options);
			
			driver.manage().window().maximize(); 
			
			driver.get("https://www.facebook.com/login/");
	
			
			driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click(); //Xpath with text()
			
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vinay");
			
            //driver.findElement(By.xpath("//label[text()='Female']")).click();
		    
			//xpath with contains()
			
           // driver.findElement(By.xpath("//input[contains(@id,'u_0_4')]")).click();		 
		    
		  
		   //xpath with starts-with()
            
            driver.findElement(By.xpath("//input[starts-with(@id,'u_0_4')]")).click();
            
         boolean b = driver.findElement(By.xpath("//input[starts-with(@id,'u_0_4')]")).isSelected();
         
         System.out.println(b);
            
            
	}

}
;
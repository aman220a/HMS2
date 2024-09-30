package Project.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertWithText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		
			WebDriver driver = new ChromeDriver(options);
			
			driver.manage().window().maximize(); 
			
			driver.get("https://demo.automationtesting.in/Alerts.html");
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
			
			driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
			
			driver.switchTo().alert().sendKeys("Automation Session");
			
			driver.switchTo().alert().accept();
			
			String  s2 = driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
			
			System.out.println(s2);
			}
	

}

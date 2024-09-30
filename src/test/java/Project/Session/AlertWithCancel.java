package Project.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertWithCancel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		  ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		
			WebDriver driver = new ChromeDriver(options);
			
			driver.manage().window().maximize(); 
			
			driver.get("https://demo.automationtesting.in/Alerts.html");
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
			
			driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
			
			String s1 = driver.switchTo().alert().getText();
			
			System.out.println(s1);
			
			Thread.sleep(3000);
			
			driver.switchTo().alert().dismiss();
			
			Thread.sleep(2000);
			
			System.out.println(driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText());
			
			
			
			
			
	}

}

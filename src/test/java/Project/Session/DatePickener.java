package Project.Session;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePickener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		//Method1 : 
		
		//driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("04/05/2024");
		
		
		//Method 2 :
		
		String year = "2020";
		String month = "May";
		String day = "20";
		
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		
		//Select Month & year
		
		while(true)
		{
			String currentmonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if (currentmonth.equals(month)&& currentyear.equals(year))
			{
				break;
			}
			
			  //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
		
		//select the date
		
		List<WebElement> alldate =   driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		
		for(WebElement dt:alldate)
			if(dt.getText().equals(day))
			{
				dt.click();
				break;
				
				
				}
		
		
	}

}

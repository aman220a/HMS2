package Project.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;

public class JavaSCript1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://testautomationpractice.blogspot.com/");	
		
		driver.manage().window().maximize();		
		WebElement inputbox = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// To send the text
		
		js.executeScript("arguments[0].setAttribute('value','Aman')", inputbox);
		
		// To perform click operation
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"male\"]"));
		
		js.executeScript("arguments[0].click()", button);
		
		// To find the domain of the webpage
		
		String  domain = js.executeScript("return document.domain;").toString();
		
		System.out.println(domain);
		
		// To find the url
		
	   String URL =js.executeScript("return document.URL;").toString();
	   System.out.println(URL);
	   
	   String Title =js.executeScript("return document.title;").toString();
	   System.out.println(Title);
	   
	   
	  // js.executeScript("alert('Alert message to.');");
	   
	   
	   // navigate to different web page
	   
	   js.executeScript("window.location='https://www.google.com/'");
	   
		
		
	}
	
	
	

}

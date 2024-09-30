package Project.Session;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZoominOrZoomout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ChromeOptions options = new ChromeOptions();
			
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(options);
			
			driver.manage().window().maximize();
			
			driver.get("https://testautomationpractice.blogspot.com/");
			
		
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("document.body.style.zoom='150%'");
			
			
			
			
			
		
		
		
	}

}

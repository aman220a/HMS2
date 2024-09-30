package Project.Session;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TakesScreendhot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		
			WebDriver driver = new ChromeDriver(options);
			
			driver.manage().window().maximize(); 
			
			driver.get("https://testautomationpractice.blogspot.com/");
		
			/*TakesScreenshot ts = (TakesScreenshot)driver;
			
			File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		
		    File targetfile = new File("/home/yagvendra/Documents/PracticalMaven/Session//Screenshot/fullpage.png");
		    
		    sourcefile.renameTo(targetfile);
		    
		    
		    
		    //capture the screenshot for a specific section
		    
		    
		    WebElement featuredproducts = driver.findElement(By.xpath("//*[@id=\"header-inner\"]"));
		    
		 File sourcefile =   featuredproducts.getScreenshotAs(OutputType.FILE);
		 
		 File targetfile  = new File("/home/yagvendra/Documents/PracticalMaven/Session/Screenshot/feturedproducts.png");
		 
		 sourcefile.renameTo(targetfile);
		 
		 */
		 
		 // capture the screenshot for particular web Element
		 
			
			 WebElement featuredproducts = driver.findElement(By.xpath("//*[@id=\"header-inner\"]/div[1]/h1"));
			 
			File sourcefile =  featuredproducts.getScreenshotAs(OutputType.FILE);
			
			File targetfile = new File("/home/yagvendra/Documents/PracticalMaven/Session/Screenshot/featureproducts.png");
			
			sourcefile.renameTo(targetfile);
		 
	}

}

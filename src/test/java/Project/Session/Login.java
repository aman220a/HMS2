package Project.Session;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		
			WebDriver driver = new ChromeDriver(options);
			
			driver.manage().window().maximize(); // Used to maximize the windows
			
			driver.get("https://www.google.com/");
			
			Thread.sleep(5000);   // used to hold the program execution for specific time
			
			driver.navigate().to("https://www.saucedemo.com/v1/");
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			Thread.sleep(2000);
			
			driver.navigate().forward();
			
			driver.get("https://facebook.com/");
			
			String title = driver.getTitle();
			
			System.out.println(driver.getTitle()); // actual title
			
			String S1 = "Google";       // Expected title
			
			if(title.equals(S1))
			{
				System.out.println("Title is Same");
			}
			
			else 
			{
				System.out.println("Title not matched");
			}
			
			System.out.println(driver.getCurrentUrl());
			
		    Thread.sleep(5000);  //wait
			
			driver.close();		
			
			
		
		
	}

}

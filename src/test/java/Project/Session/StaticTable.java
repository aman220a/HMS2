package Project.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 ChromeOptions options = new ChromeOptions();
			
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(options);
			
			driver.manage().window().maximize();
			
			driver.get("https://testautomationpractice.blogspot.com/");
			
			
			// no of rows in the table
			
		    int rows = 	driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();	
		    
		    System.out.println(rows);	
		    
		    
		    // no of columns in the table
		    
		   int columns= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();	    
		   
		   System.out.println(columns);
		   
		   
		   // read the element of the table
		   
		   String book = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		   
		   System.out.println(book);
		   
          String book1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[4]")).getText();
		   
		   System.out.println(book1);
		   
		   
		   //Read all the data from the table
		   
		   for(int r=2;r<=rows;r++)
		   {
			   for(int c=1;c<=columns;c++)
			   {
				  String value= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				  System.out.print(value + " ");
			   }
			   
			   System.out.println();
		   }
	}

}

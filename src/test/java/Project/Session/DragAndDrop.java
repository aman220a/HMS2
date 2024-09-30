package Project.Session;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		
		
		Actions act = new Actions(driver);
		
		WebElement rome = driver.findElement(By.xpath("//*[@id=\"box6\"]"));
		
		WebElement Italy = driver.findElement(By.xpath("//*[@id=\"box106\"]"));
		
		act.dragAndDrop(rome, Italy).build().perform();		
	}

}

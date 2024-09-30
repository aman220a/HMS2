package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="emailaddress")
	WebElement userName;
	
	@FindBy(name = "ad_pwd")
	WebElement passWord;
	
	@FindBy(name ="admin_login")
	WebElement button;
	
	public void setUsername(String uname)
	{
		userName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		passWord.sendKeys(pwd);
	}
	
	public void click()
	{
		button.click();
	}
}

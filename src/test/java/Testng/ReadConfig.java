package Testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	String path ="/home/yagvendra/Documents/PracticalMaven/Session/src/test/java/Testng/Config.properties";
	
	public ReadConfig()
	{
		pro = new Properties();
		
	    try {
			FileInputStream fis = new FileInputStream(path);
			try {
				pro.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	
	public String getURL()
	{
		String url = pro.getProperty("url");
		return url;
	}
	
	
	public String getUserName()
	{
		String username = pro.getProperty("username");
				
		return username;
	}
	
	public String getPassword()
	{
		String password = pro.getProperty("password");
		return password;
	}
	
}

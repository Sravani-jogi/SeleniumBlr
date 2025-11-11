package com.setup;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.parameters.PropertyReader;

public class BaseSteps {
	public static WebDriver driver;
	 
	public static void launchBrowser()
	{
		Properties prop = PropertyReader.readProperty();
		String browser = prop.getProperty("browserName");  //chrome will comw
 
 
		if (browser.equalsIgnoreCase("chrome"))            //chrome will launch
		{  			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\jogisr\\OneDrive - Capgemini\\Desktop\\SeleniumGrid\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox"))    // firefox will launch
		{  
			
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge"))       //edge will launch
		{  
			System.setProperty("webdriver.edge.driver","C:\\Training\\seleniumgrid\\SeleniumGrid\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Invalid browser specified in config.properties");
			return;
		}
		String url = prop.getProperty("sourceUrl");
		driver.get(url);
		driver.manage().window().maximize();
 
	}
 
	public static void sleep(int msec)                      //handling waits
	{    
		try
		{
			Thread.sleep(msec);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	

}

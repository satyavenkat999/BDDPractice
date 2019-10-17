package com.qa.crm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		
	try {
			prop = new Properties();
			FileInputStream fs = new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\BDDPractice\\src\\main\\java\\com\\qa\\crm\\config\\config.properties");
			prop.load(fs);
		} catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void intialization() 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chrome76\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));
	}
}



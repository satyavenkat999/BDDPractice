package com.qa.crm.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.qa.crm.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(xpath = "//input[@name='username']")
	WebElement txtUserName;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement txtPassWord;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}

	
	public HomePage userLogin() {
		
		txtUserName.sendKeys(prop.getProperty("username"));
		txtPassWord.sendKeys(prop.getProperty("password"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",btnLogin);
		
		return new HomePage();
	}
	
	public String verifyTitle() 
	{
		return driver.getTitle();
		
	}
	
}

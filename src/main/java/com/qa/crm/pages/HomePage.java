package com.qa.crm.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//a[contains(text(),'Calendar')]")
	WebElement lblCalendar;
	
	@FindBy(xpath="//a[contains(text(),'Companies')]")
	WebElement lblCompany;

	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	static WebElement lblNewCompany;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	static WebElement lblContacts;

	@FindBy(xpath="//a[contains(text(),'Deals')]")
	static WebElement lblDeals;

	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	static WebElement lblTasks;
	
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public static ContactsPage clkContact() 
	{
		driver.switchTo().frame("mainpanel");
		lblContacts.click();
		return new ContactsPage();
		
		//Actions a = new Actions(driver);
		//a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		//a.moveToElement(lblContacts).build().perform();
		//lblNewCompany.click();
	}
	
	public static DealsPage clkDeals()
	{
		driver.switchTo().frame("mainpanel");
		lblDeals.click();
		return new DealsPage();
		
	}

	public static TasksPage clkTasks()
	{
		driver.switchTo().frame("mainpanel");
		lblTasks.click();
		return new TasksPage();
	}
	
	
//	Actions a = new Actions(driver);
//	a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//	driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();

	
	public static void verifyLabels() 
	{
		System.out.println("Lable verified");
		
		/*driver.switchTo().frame("mainpanel");
		
		boolean contactFlag = lblContacts.isDisplayed();
		Assert.assertTrue(contactFlag);

		boolean dealsFlag = lblDeals.isDisplayed();
		Assert.assertTrue(dealsFlag);
		
		boolean tasksFlag = lblTasks.isDisplayed();
		Assert.assertTrue(tasksFlag);*/

		
	}
}

package com.qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.TestBase;

public class TasksPage extends TestBase{

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

	
	public TasksPage() 
	{
		PageFactory.initElements(driver, this);
	}

	
	
}


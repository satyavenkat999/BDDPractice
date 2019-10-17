package com.qa.crm.StepDefinitions;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.qa.crm.base.TestBase;
import com.qa.crm.pages.HomePage;
import com.qa.crm.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;

public class LoginStepDefinition extends TestBase{

		//WebDriver driver;
		LoginPage loginpage = new LoginPage();
		HomePage homePage;

		@Given("^Browser opened$")
		public void browser_opened() {
		
			intialization();
			System.out.println("Browser opened");
		}

		@Then("^Verify the login title$")
		public void verify_the_login_title() {
			String title = loginpage.verifyTitle();
			System.out.println("Verify title: " + title);
		}

		@When("^User entered Username and Password$")
		public void user_entered_Username_and_Password() throws Throwable {
			
				loginpage = new LoginPage();
				homePage = loginpage.userLogin();
//				driver.findElement(By.name("username")).sendKeys("satyavenkat");
//				driver.findElement(By.name("password")).sendKeys("FreeCRM123");
			
			
		}		
	
		@When("^User clicked on Login Button$")
		public void user_clicked_on_Login_Button()
		{
			
			
		System.out.println("Login clicked");

		}

		@When("^Home page title got verified$")
		public void home_page_title_got_verified() {
			System.out.println("Title verified");
		    
		}

		@Then("^Browser closed$")
		public void browser_closed()  {
			System.out.println("Browser Closed");
		}

		@Given("^Home page loaded$")
		public void home_page_loaded() throws Throwable {
			System.out.println("Home page displayed");
		}

		@Then("^Required labels are displayed$")
		public void required_labels_are_displayed() throws Throwable {
			homePage = new HomePage();
			homePage.verifyLabels();
		}

		@When("^Click on Contacts lable$")
		public void click_on_Contacts_lable() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    homePage.clkContact();
		}

		
}

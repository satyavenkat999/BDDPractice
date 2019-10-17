package com.qa.crm.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Administrator\\eclipse-workspace\\BDDPractice\\src\\main\\java\\com\\qa\\crm\\features\\login.feature"
		,glue= {"com.qa.crm.StepDefinitions"}
		,dryRun = false
		,monochrome = true
		//,format = {"pretty","html:test-output"}
		)			


public class TestRunner {

	
	
}

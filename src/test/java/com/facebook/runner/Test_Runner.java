package com.facebook.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.Base;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//facebook//feature",


glue = "com.facebook.stepdefinition"
		
		)



public class Test_Runner {

	public static WebDriver driver;
	
	
	@BeforeClass
	public static void setUp() {

		driver = Base.browserLaunch("chrome");
		
		
		
	}
	
	
}

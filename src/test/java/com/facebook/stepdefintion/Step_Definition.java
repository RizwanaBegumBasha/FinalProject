package com.facebook.stepdefintion;

import org.openqa.selenium.WebDriver;

import com.BaseClass.Base;
import com.facebook.runner.Runner;

import PomPackage.LoginPage;
import cucumber.api.java.en.*;

public class Step_Definition extends Base {
	public static WebDriver driver =Runner.driver;
	public static LoginPage log = new LoginPage(driver);
	
	
	//LoginPage login = new LoginPage(driver);
	
	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
		gets("https://www.facebook.com/");
		
		
		
	}

	@When("^user enter the email in email field$")
	public void user_enter_the_email_in_email_field() throws Throwable {
		sendkey(log.email, "sivasubramani1997@gmail.com");
		
	}

	@When("^user enter the password in password field$")
	public void user_enter_the_password_in_password_field() throws Throwable {
		sendkey(log.pass, "rizwana@123");
	}

	@Then("^user click on the login button and navigate to main page$")
	public void user_click_on_the_login_button_and_navigate_to_main_page() throws Throwable {
		Thread.sleep(3000);
		click(log.sign);
		
	}

	

}

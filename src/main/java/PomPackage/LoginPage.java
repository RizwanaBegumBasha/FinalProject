package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver driver;
	
	@FindBy(name="email")
	
	public static WebElement email;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getPass() {
		return pass;
	}

	@FindBy(name="pass")
	
	public static WebElement pass;
	@FindBy(xpath ="/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")
	public static WebElement sign;
	
	public static WebElement getSign() {
		return sign;
	}

	public LoginPage(WebDriver adriver)
	{
		this.driver= adriver;
		PageFactory.initElements(driver, this);
				
	}
}

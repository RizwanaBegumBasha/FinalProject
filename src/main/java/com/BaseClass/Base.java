package com.BaseClass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static WebDriver driver;

	// browserlaunch

	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Sulthana Begum\\Desktop\\Project 1\\ProjectTask\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		} 

		return driver;
	}

	// close

	public static void closes(WebElement element) {
		element.click();
	}

	// clear

	public static void clear(WebElement element) {
		element.clear();
	}

	// quit

	public static void quits(WebDriver element) {
		element.quit();
	}

	// navigate to

	public static void navigateto(String s) {
		driver.navigate().to(s);
	}

	// navigate back

	public static void navigateback() {
		driver.navigate().back();
	}

	// navigate forward

	public static void navigateforward() {
		driver.navigate().forward();

	}

	// navigate refresh

	public static void navigaterefresh() {
		driver.navigate().refresh();
	}

	// get

	public static void gets(String s) {
		driver.get(s);
	}

	// alert
	// accept

	public static void accept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	// dismiss

	public static void dismiss() {
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
	}

	// actions

	// click
	public static void click1(WebElement element) {
		Actions ac = new Actions(driver);
		ac.click(element).build().perform();
	}

	// contextclick
	public static void contextclick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	}

	// double
	public static void doubleclick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).build().perform();
	}

	// movetoelement

	public static void movetoelement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	// draganddrop

	public static void draganddrop(WebElement from, WebElement to) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(from, to);
	}

	// robot

	public static void robot() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// frame

	public static void frame(WebElement element) {
		driver.switchTo().frame(element);
	}

	// parentframe

	public static void parentframe() {
		driver.switchTo().parentFrame();

	}

	// defualtcontent

	public static void defualtcontent() {
		driver.switchTo().defaultContent();

	}

	// windowhandles

	public static void windowhandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
		}

	}

	// gowindow

	public static void gowindow(String link) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			String title = driver.switchTo().window(string).getTitle();
		}
		String s = link;
		for (String string2 : windowHandles) {
			if (driver.switchTo().window(string2).getTitle().equals(link)) {
				break;
			}
		}
	}

//dropdown----> single 
	// selectbyvalue

	public static void selectbyvalue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	// selectbyindex

	public static void selectbyindex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	// selectbyvisibletext

	public static void selectbyvisibletext(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	// dropdown----> multiple

	// ismultiple

	public static void ismultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	// getalloption

	public static void getalloption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> alloptions = s.getOptions();

		for (WebElement webElement : alloptions) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}

	// getallselectedoption

	public static void getallselectedoption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());

		}
	}

	// getfirstselectedoption

	public static void getfirstselectedoption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}

	// isenabled

	public static void isenabled(WebElement element) {
		element.isEnabled();
	}

	// isdisplayed
	public static void isdisplayed(WebElement element) {
		element.isDisplayed();
	}

	// isselected
	public static void isselected(WebElement element) {
		element.isSelected();

	}

	// gettitle

	public static void gettitle() {
		driver.getTitle();
	}

	// getcurrenturl

	public static void getcurrenturl() {
		driver.getCurrentUrl();

	}

	// gettext

	public static void gettext(WebElement element) {
		element.getText();

	}

	// getattribute

	public static void getattribute(WebElement element, String value) {
		element.getAttribute(value);
	}

	// wait---implicitwait

	public static void implicit() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	// wait---explicittwait

	public static void explicit(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// takescreenshot

	public static void screenshot(String s) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File(s);
		FileUtils.copyFile(from, to);
	}

	// scrollup--->javascriptexecutor

	public static void scrollup(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView", element);
	}

	// scrolldown--->javascriptexecutor

	public static void scrolldown(WebElement element) {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView", element);
	}

	// bottom of the page

	public static void bottom() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(o,document.body.scrollHeight)");

	}

	// sendkey

	public static void sendkey(WebElement element, String value) {
		element.sendKeys(value);

	}

	// click

	public static void click(WebElement element) {
		element.click();
	}

}

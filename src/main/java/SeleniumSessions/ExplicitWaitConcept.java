package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		//explicit wait
			//its applied for a specific element, not for all the elements
			//not a global wait
			//can be used for non web elements: title, url, 
			// polling/interval
		
		//1. webdriverwait
		//2. fluentwait
	
		//WebDriverWait(c) -- extends --> FluentWait(c) -- implements --> Wait(I) --until();
		
		//FluentWait -- until()-- @override + other methods
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By pwd = By.id("input-password");
		By logo = By.cssSelector("img.img-responsive");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement email_el = wait.until(ExpectedConditions.presenceOfElementLocated(emailID));
//		
//		email_el.sendKeys("bhargavi@gmail.com");
//		
//		driver.findElement(pwd).sendKeys("test@123");
//		
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
//		WebElement logo_el = wait1.until(ExpectedConditions.presenceOfElementLocated(logo));
//		boolean flag = logo_el.isDisplayed();
//		System.out.println(flag);
//		
//		boolean flag = driver.findElement(logo).isDisplayed();
//		System.out.println(flag);
//		
		waitForElementPresence(emailId, 10).sendKeys("bhargavi@gmail.com");
		getElement(pwd).sendKeys("test@123");
		
		if(waitForElementPresence(logo, 5).isDisplayed()) {
			System.out.println("logo is present");
		}
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}

	public void doSendKeysWithWait(By locator, int timeOut, String value) {
		waitForElementPresence(locator, timeOut).sendKeys(value);
	}
	public void doClickWithWait(By locator, int timeOut) {
		waitForElementPresence(locator, timeOut).click();
	}
	
	public String getElementWithWait(By locator, int timeOut) {
		return waitForElementPresence(locator, timeOut).getText();
	}
	
public static WebElement waitForElementVisible(By locator, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
public void doSendKeysWithVisibleElement(By locator, int timeOut, String value) {
	waitForElementVisible(locator, timeOut).sendKeys(value);
}
public void doClickWithVisibleElement(By locator, int timeOut) {
	waitForElementVisible(locator, timeOut).click();
}

public String getElementWithVisbleElement(By locator, int timeOut) {
	return waitForElementVisible(locator, timeOut).getText();
}

	
	
}

package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementClick {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vamsh\\OneDrive\\Desktop\\Selenium Broswers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
            driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login"); 
            
        	
    		driver.get("https://app.hubspot.com/login");
    		
//    		driver.findElement(By.id("username")).sendKeys("naveen@gmail.com");
//    		driver.findElement(By.id("password")).sendKeys("naveen@123");
//    		
//    		driver.findElement(By.id("loginBtn")).click();
    		
    		//By locators:
    		By username = By.id("username");
    		By pwd = By.id("password");
    		By loginBtn = By.id("loginBtn");
    		
    		doSendKeys(username, "naveen@gmail.com");
    		doSendKeys(pwd, "test@123");
    		doClick(loginBtn);
    		
    	}
    	
    	public static WebElement getElement(By locator) {
    		return driver.findElement(locator);
    	}
    	
    	public static void doSendKeys(By locator, String value) {
    		getElement(locator).sendKeys(value);
    	}
    	
    	public static void doClick(By locator) {
    		getElement(locator).click();
    	}


		
	}


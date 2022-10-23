package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForUrl {
	static WebDriver driver;
	public static void main(String[] args) {

		
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

		//window switch code
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		
		
		
		
		
	}
	
//	public static String waitForUrl(int timeOut) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
////		if(wait.until(ExpectedConditions.urlToBe(urlValue))) {
//			return driver.getCurrentUrl();
//			
//		}else {
//			return null;
//		}
//		
		
	}



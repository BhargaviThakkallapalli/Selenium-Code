package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PseudoElementHandle {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();

		WebDriver	driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		JavascriptExecutor js = (JavascriptExecutor)driver;
			
		
		
		
		
	}

}

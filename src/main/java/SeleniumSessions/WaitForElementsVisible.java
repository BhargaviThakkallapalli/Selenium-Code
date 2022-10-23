package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForElementsVisible {
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshwork.com/");
	
	
			By support = By.cssSelector("div.copyrights a");
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			List<WebElement> ele =wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(support));
		
}
}

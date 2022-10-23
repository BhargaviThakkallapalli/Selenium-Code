package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshwork.com/");
	
		By support = By.linkText("support");
		
		//fluent wait is implementing wait Interface
		//FW(c)---> Wait(I)
	
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
											.withTimeout(Duration.ofSeconds(10))
												.pollingEvery(Duration.ofSeconds(2))
													.ignoring(NoSuchElementException.class)
														.withMessage("element is not availble");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(support));
////	
//		//WebDriverWait with Fluent features:
//		
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//		
//		wait1.pollingEvery(Duration.ofSeconds(2))
//			.ignoring(NoSuchElementException.class);
//		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(support)).click();
//
//		
//		
		
		
		
}
}
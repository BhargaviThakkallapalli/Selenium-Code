package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTitle {

	static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");

		driver.findElement(By.name("proceed")).click();
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	
		if(wait.until(ExpectedConditions.titleContains("Modern and Easy Customer"))) {
			System.out.println(driver.getTitle());
		}
		
//	//	if(wait.until(ExpectedConditions.titleIs("Freshworks | Modern and Easy Customer and Employee Experience software")));
//		{
//			System.out.println(driver.getTitle());
//		}
		
		
	
	}

	public static void titleIs() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		if(wait.until(ExpectedConditions.titleIs("Freshworks | Modern and Easy Customer and Employee Experience software")));
	{
	System.out.println(driver.getTitle());
	}
	}
	
	
	
}

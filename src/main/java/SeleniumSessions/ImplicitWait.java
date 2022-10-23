package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {

		//ImplicitWait:
			//1. global wait
			//2. it will be applied on all the web elements by default
			//3. applied after the driver declaration
			//4. not recommended
			//5. it does not support non web element --> title, url, alerts 
		
		//we never use Implicitly wait in framework, there is no usecase for Implicitly wait
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement emailId = driver.findElement(By.id("input-email"));
		emailId.sendKeys("bhargavi@gmail.com");
		
		
		
		//login page:
		//e1 -- 5secs --> 10-5 = 5secs(ignored)
		//e2 -- 0secs --> 10-0 = 10secs(ignored)
		//e1 -- 4secs --> 10-4 = 6secs(ignored)
		
		//home page: 5 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//e4
		//e5
		//e6
		
		//login page: 10 secs
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//registration page: 0 sec: nullify implicitly wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		
		
		
		
		
		
	}

}

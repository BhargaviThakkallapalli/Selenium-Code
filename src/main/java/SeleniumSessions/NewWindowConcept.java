package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowConcept {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
	
		driver.get("https://opensource-demo.orangehrmlive.com/"); //parent window
		Thread.sleep(4000);
		String parentWindowId = driver.getWindowHandle();
		
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("https://www.google.com");
	
	System.out.println(driver.getTitle());
	
	driver.close();
	
	driver.switchTo().window(parentWindowId);
	System.out.println(parentWindowId);
		
		
		
		
		
		
		
	}

}

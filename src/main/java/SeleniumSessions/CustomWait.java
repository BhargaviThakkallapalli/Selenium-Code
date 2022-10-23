package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {

static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshwork.com/");
	
		By support = By.linkText("support");
		retryingElement(support,10);
	}
	
	public static WebElement getElement(By locator)
	{

		return driver.findElement(locator);
	}
	public static WebElement retryingElement(By locator,int timeOut) {
		
		WebElement element = null;
		
		int attempts = 0;
		
		while(attempts < timeOut) {
			
			try
			{
				element = getElement(locator);
				break;
			}
			catch(NoSuchElementException e) {
				System.out.println("element is not found");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
			}
			attempts++;
			
		}
		
		if(element == null) {
			System.out.println("element is not fond after all the attempts....");
		}
		return element;
		
	}

}

package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumException {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		//WE + action
		
		//WebElement ele = driver.findElement(By.name("search11"));
		//ele.sendKeys("mackbook pro");
		//NoSuchElementException
		//ElementNotFoundException --- not in selenium
		
//		
//		List<WebElement> footerLinks = driver.findElements(By.xpath("//footer//naveen"));
//		System.out.println(footerLinks.size());
//		//return empty list --  size --->0
//		
		
		List<WebElement>list = driver.findElements(By.name("search"));
		System.out.println(list.size());
		//1.
		if(list.size()==1)
		{
			System.out.println("single search ele is present on the page");
		}
		else
		{
			System.out.println("no search or multiple search present on the page");
		}
		//2.
		boolean flag = driver.findElement(By.name("search")).isDisplayed();
		if(flag) {
			System.out.println("search ele is present on the page");
		}
}
	public static void isSingleElementPresent(By locator) {
		List<WebElement>list = driver.findElements(By.name("search"));
		System.out.println(list.size());
		if(list.size()==1)
		{
			System.out.println("single search ele is present on the page");
		}
		else
		{
			System.out.println("no search or multiple search present on the page");
		}
	}
}


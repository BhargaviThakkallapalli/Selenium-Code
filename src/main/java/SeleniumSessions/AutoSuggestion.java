package SeleniumSessions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AutoSuggestion {


			static WebDriver driver;

			public static void main(String[] args) throws InterruptedException {

				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Casual Dresses > Printed']")).click();
	
			}
			
			
			public static void doSearch(String text) {
				By suggLocator = By.xpath("//[text()='"+text+"']");
				getElement(suggLocator).click();
				
			}
			
			
			
			private static WebElement getElement(By suggLocator) {
				// TODO Auto-generated method stub
				return null;
			}

}

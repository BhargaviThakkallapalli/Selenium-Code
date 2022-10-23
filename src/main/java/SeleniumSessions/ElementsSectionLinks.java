package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementsSectionLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		List<WebElement> sectionsLinks = driver.findElements(By.className("list-group-item"));
//		
//		System.out.println(sectionsLinks.size());
//		
//		for(WebElement e: sectionsLinks) {
//			String text = e.getText();
//		}	
//		
		
		
		
		
	}

}

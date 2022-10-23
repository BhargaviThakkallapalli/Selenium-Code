package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {

		
		//right click or context menu
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClkEle = driver.findElement(By.cssSelector("span.cotext-menu-one"));
		
		Actions act = new Actions(driver);
		
		List<WebElement> ele = driver.findElements(By.xpath("//ul[contains(@class, 'context-menu-list')/li/span"));
		
		System.out.println(ele.size());
		
		for(WebElement e: ele) {
			String text = e.getText();
			
		}
		
		
	}

}

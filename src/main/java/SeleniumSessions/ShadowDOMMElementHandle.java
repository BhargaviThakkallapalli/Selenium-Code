package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDOMMElementHandle {

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
		   //page --- elements
		      //iframe -- elements
					//shadow dom(open) -- elements -- tea
	
		//Launch the browser
		   	//page --- elements
				//shadow dom(open)-- elements -- tea
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
		
		
		driver.switchTo().frame("pact");
		
		//document.querySelector("#snacktime").shadowRoot.querySelector("#tea")
		
		
		
		driver.findElement(By.id("tea")).sendKeys("masala tea");
		
		
	
		
		
		
		
		
		
	}

}

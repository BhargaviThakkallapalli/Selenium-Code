package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlingWithoutSelect {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		// select/option --- 232
		
		By country = By.xpath("//select/option");

	}
	private static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public static void doSelectValueFromDropDown(By locator, String value) {
		
		
		//List<WebElement> optionsList = driver.findElements(By.xpath("//select/option"));

			
		List<WebElement> optionsList = getElements(locator);
			
		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);

			if (text.equals("India")) {
				e.click();
				break;
				}

		}

	}

	
}

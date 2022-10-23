package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassSndKeys {
	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		By firstName = By.id("input-firstname");
		By checkbox = By.name("agree");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(driver.findElement(firstName), "Bhargavi").build().perform();
		
		act.click(driver.findElement(checkbox)).build().perform();
		//clicks in the middle of the given element.
		
		//Equivaalent to: Actions.moveToELement(onElemenet).
				
	}

	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.sendKeys(null);
	}
}

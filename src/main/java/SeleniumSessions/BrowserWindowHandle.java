package SeleniumSessions;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
	
		driver.get("https://classic.crmpro.com/index.html");
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(2000);
		
		Set<String> handles = driver.getWindowHandles();
		
	java.util.Iterator<String> it= handles.iterator();
		String parentWindowId = it.next();
		System.out.println("Parent window id is:"+parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("child window id is:"+childWindowId);
		
		//switching
		driver.switchTo().window(childWindowId);
		System.out.println("child window title : " + driver.getTitle());
		driver.findElement(By.name("first_name")).sendKeys("bhargavi");
		
		//close child window:
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title : " + driver.getTitle());
		
		driver.quit();
		
	}

}

package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserHandleWindowPractice {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
	
		driver.get("https://opensource-demo.orangehrmlive.com/"); //parent window
		Thread.sleep(4000);
		
		String parentWindowId = driver.getWindowHandle();
		
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[1]")).click();//linkedin
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[2]")).click(); //fb
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[3]")).click();//tw
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[4]")).click();//you
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(4000);
			
			if(!windowId.equals(parentWindowId)){
				driver.close();
			}
			
		}
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
	}
	

}

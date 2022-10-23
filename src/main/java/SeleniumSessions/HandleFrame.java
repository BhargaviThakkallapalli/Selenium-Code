package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
			//frame
			//iframe
			
			
			//1. Frame Index
			//driver.switchTo().frame(2);
			//2. Frame with name or Id attribute
			//driver.switchTo().frame("main");
			//3. Frame element
			driver.switchTo().frame(driver.findElement(By.name("main")));
			
			
			
			String header = driver.findElement(By.xpath("/html/body/h2")).getText();
			System.out.println("header");

		
		
		
		
	}

}

package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
	
		//Java script pop up
		//alert pop up
		
	//model dialog pop up
		//at a time only one pop up is allowed  
		//1. alert()
		//2.confirm()
		//3. prompt()
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(4000);
		//pop up is displayed
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		//alert.senkeys(testing);
		
		//accept the alert:
		alert.accept();
		
		//dismiss the alert:
		//alert.dismiss();
		
		
		
	}

}

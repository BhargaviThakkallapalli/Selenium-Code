package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		
		// open browser: google chrome
        //Launch url: google.com
		//get the title
		//verify the title: act vs exp
		//close the browser
		
		//download Chromedriver.exe file -- configure it
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\vamsh\\Dropbox\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //top casting
		//C:\Users\vamsh\Dropbox\PC\Downloads\chromedriver_win32
		

		driver.get("https://www.google.com");// enter url

		String title = driver.getTitle();// get the title
		System.out.println("page title : " + title);

		// verification point: act vs exp result // checkpoint
		if (title.equals("Google")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		String url = driver.getCurrentUrl();
		System.out.println(url);

		String source = driver.getPageSource();
		// System.out.println(source);
		if (source.contains("Copyright The Closure Library Authors")) {
			System.out.println("Pass");
		}

		// close the browser:
		driver.quit();
		// driver.close();
	
		
	}

}

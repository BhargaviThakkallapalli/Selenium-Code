package SeleniumSessions;


import org.openqa.selenium.WebDriver;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	private WebDriver driver;

	/**
	 * this method is used to initialize the driver on the basis of browser name
	 * 
	 * @param browser
	 * @throws Exception
	 */
	public WebDriver launchBrowser(String browser) {
		System.out.println("browser name is : " + browser);

		switch (browser.toLowerCase()) {
		case "chrome":
			// System.setProperty("webdriver.chrome.driver", "C:\\Users\\vamsh\\OneDrive\\Desktop\\Selenium Broswers\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\vamsh\\OneDrive\\Desktop\\Selenium Broswers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			//WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
			// C:\Users\vamsh\OneDrive\Desktop\Selenium Broswers\geckodriver-v0.31.0-win64
			//C:\Users\vamsh\OneDrive\Desktop\Selenium Broswers\chromedriver_win32
			//C:\Users\vamsh\OneDrive\Desktop\Selenium Broswers\edgedriver_win64

		case "edge":
			//System.setProperty("webdriver.edge.driver", 
				//	"C:\\Users\\vamsh\\OneDrive\\Desktop\\Selenium Broswers\\edgedriver_win64\\msedgedriver.exe");

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
	break;

		default:
			System.out.println("plz pass the right browser.....");
			//throw new Exception("WRONGBROWSER");
		// break;
		}

		return driver;
	}

	public void launchUrl(URL url) throws Exception {
		String newURL = String.valueOf(url);
		if (newURL == null) {
			System.out.println("url is null");
			throw new Exception("URLISNULL");
		}

		if (newURL.length() == 0) {
			System.out.println("url is blank");
			throw new Exception("URLBLANKEXCEPTION");
		}

		// http(s) -- homework
		// http://www.google.com
		if (newURL.indexOf("http") != 0 && newURL.indexOf("https") != 0) {
			System.out.println("http(s) is missing in url");
			throw new Exception("HTTP(s)MISSINGEXCEPTION");
		}

		driver.navigate().to(url);
	}

	public void launchUrl(String url) throws Exception {
		if (url == null) {
			System.out.println("url is null");
			throw new Exception("URLISNULL");
		}

		if (url.length() == 0) {
			System.out.println("url is blank");
			throw new Exception("URLBLANKEXCEPTION");
		}

		// http(s) -- homework
		// http://www.google.com
		// https
		if (url.indexOf("http") != 0 && url.indexOf("https") != 0) {
			System.out.println("http(s) is missing in url");
			throw new Exception("HTTP(s)MISSINGEXCEPTION");
		}

		driver.get(url);

	}

	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		if (title != null) {
			return title;
		} else {
			System.out.println("getting null title....");
			return null;
		}
	}

	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("page title : " + url);
		if (url != null) {
			return url;
		} else {
			System.out.println("getting null title....");
			return null;
		}
	}

	public void closeBrowser() {
		if (driver != null) {
			driver.close();
			System.out.println("browser is closed.....");
		}
	}

	public void quitBrowser() {
		if (driver != null) {
			driver.quit();
			System.out.println("browser is closed.....");

		}
	}

}
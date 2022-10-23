package testcases;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class RegistrationPageTest {
		
		//data driven approach
		//testNG dataprovider
		
		WebDriver driver;
		
		@BeforeTest
		public void setup() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().deleteAllCookies();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		}
		
		@DataProvider
		public Object[][] getRegistrationData() {
				return new Object[][] {
				{"Bhargavi", "Thakkallapalli", "bhargathakkallapalli2@gmail.com", "0424435791", "Mahi@2402"},
				{"Vamshi", "Surabhi", "surabhiv92@gmail.com", "0432871114", "Mahansh@2402"}
				//{"Mahansh", "Surabhi", "bhargavithakkallapalli1@gmail.com", "9550671324", "Maha@2402"},
				//{"Josh", "Thakkallapally", "joshthakkallapally1@gmail.com", "9959890630", "Jasmi@1005"},
				//{"Kishan Rao", "chikyala", "kishan.c1@gmail.com", "9866373771", "Jasmi@1005"}
				};
		}
		
		@Test(dataProvider = "getRegistrationData")
		public void registrationTest(String firstname, String lastname, String email, String telephone, String password) {
			Assert.assertEquals(doRegistration(firstname, lastname, email, telephone, password), true);
		}
		
		
		public boolean doRegistration(String firstname, String lastname, String email, String telephone, String password) {
			driver.findElement(By.id("input-firstname")).clear();
			driver.findElement(By.id("input-firstname")).sendKeys(firstname);
			
			
			driver.findElement(By.id("input-lastname")).clear();
			driver.findElement(By.id("input-lastname")).sendKeys(lastname);
			
			driver.findElement(By.id("input-email")).clear();
			driver.findElement(By.id("input-email")).sendKeys(email);
			
			driver.findElement(By.id("input-telephone")).clear();
			driver.findElement(By.id("input-telephone")).sendKeys(telephone);
			
			
			driver.findElement(By.id("input-password")).clear();
			driver.findElement(By.id("input-password")).sendKeys(password);
			
			driver.findElement(By.id("input-confirm")).clear();
			driver.findElement(By.id("input-confirm")).sendKeys(password);
			
			driver.findElement(By.xpath("//div/input[@value='1']")).click();
			
			//driver.findElement(By.xpath("//div//input[@value='Continue']")).click();
			driver.findElement(By.xpath("//div//input[@class='btn btn-primary']")).click();
			driver.findElement(By.xpath("(//a[contains(@href,'account/account')])[4]")).click();
			
			
			return driver.findElement(By.xpath("//div/input[@value='Continue']")).isDisplayed();
		}
		
		@AfterTest
		public void tearDown() {
			//driver.quit();
		}
	}



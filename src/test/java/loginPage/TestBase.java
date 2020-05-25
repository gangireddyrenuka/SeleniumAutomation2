package loginPage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	
	public static WebDriver driver;

	public static void browserActions(String browser) {
		
		switch(browser)
		{
		case "chrome" : 
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Kaushik\\workspace\\SeleniumAutomation2\\WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox" : 
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Kaushik\\workspace\\SeleniumAutomation2\\WebDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default : System.out.println("No Browser matching your criteria...");
		
		}
	}
		@BeforeTest
		public void browser() {
			
			browserActions("chrome");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://demo.automationtesting.in/Register.html");
			
		}
		
		@AfterTest
		public void closeBrowser() {
			
			driver.close();	
				
		
			
	}
}
		
		
	


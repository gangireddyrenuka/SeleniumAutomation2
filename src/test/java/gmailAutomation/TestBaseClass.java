package gmailAutomation;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;

	public class TestBaseClass {
		
		
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
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
				
			}
			
			@AfterTest
			public void closeBrowser() {
				
				driver.close();	
					
			
				
	
	
	
			}
	
	

}

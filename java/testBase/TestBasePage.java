package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBasePage {
	
	public static WebDriver driver;
	public static void BowserOption(String browser){
       switch(browser){
           case"chrome":System.setProperty("WebDriver.Chrome.driver","C:\\Users\\Kaushik\\workspace\\SeleniumAutomation1\\BrowserDrivers\\chromedriver.exe");
                        driver=new ChromeDriver();
                        break;
           case"firefox":System.setProperty("WebDriver.gecko.driver","C:\\Users\\Kaushik\\workspace\\SeleniumAutomation1\\BrowserDrivers\\geckodriver.exe"); 
                        driver=new FirefoxDriver();
                        break;
            default:System.out.println("no matching criteria browswe");            
       }
	}
       public void BrowserConfiguation()
       {
    	   BowserOption("chrome");
    	   driver.get("http://demo.automationtesting.in/Register.html");
    	   driver.manage().window().maximize();
    	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	   
       }
       public void BowserCloser(){
    	   driver.close();
       }
}



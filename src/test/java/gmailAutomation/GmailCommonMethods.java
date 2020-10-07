package gmailAutomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GmailCommonMethods extends TestBaseClass{
	
	
	
	public static void Inputtext(WebElement s1,String s)
	{
		s1.sendKeys(s);
	}
	
	
	public static void click(WebDriver driver,By GmailLocaters)
	{
		driver.findElement(GmailLocaters).click();
	}
	
	
	public static void Inputtext1(WebElement driver,String s3)
	{
		Select s=new Select(driver);
	}
	
	public static void WindowHandle(WebDriver driver, By composeMail) {
		
		
		   String mainPageWindowHandle = driver.getWindowHandle();
		    
		    driver.switchTo().window(mainPageWindowHandle);
		    
		  
			
		}


}

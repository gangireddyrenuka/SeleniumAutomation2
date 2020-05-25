package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import loginPage.TestBase;

public class Locators extends TestBase {
	

   

	public static By fName =By.xpath("//input[@placeholder='First Name']");
    
	public static By sName =By.xpath("//input[@placeholder='Last Name']");

    public static By adress =By.xpath("//textarea[@ng-model='Adress']");
	
	//ublic static By address =By.xpath("//label[text()='Address']/following-sibling::div");
	
    public static By email =By.xpath("//input[@type='email']");
	
    public static By tel =By.xpath("//input[@type='tel']");
     
    public static By gender =By.xpath("//input[@ng-model='radiovalue']");
     
 	public static By checkbox = By.xpath("//input[@type='radio']");
 	
     public static By male =By.xpath("//input[@value='Male']");
	
	
	}
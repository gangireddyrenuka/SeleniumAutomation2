package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import loginPage.TestBase;

public  class LoginPageExample extends TestBase {

@Test
public static void loginpage(){
		
	
	WebElement fName =driver.findElement(Locators.fName);
	ComonMethods.InputText(fName, "Devanshi");
	
	WebElement lName =driver.findElement(Locators.sName);
	ComonMethods.InputText(lName, "Bogala");
	
    WebElement adress =driver.findElement(Locators.adress);
    ComonMethods.InputText(adress,"anatapur");
	
   WebElement email =driver.findElement(Locators.email);
   ComonMethods.InputText(email, "dc.gamil");
	 
   WebElement tel =driver.findElement(Locators.tel);
   ComonMethods.InputText(tel, "1233444");
   
   ComonMethods.click(driver, Locators.gender);
   
	ComonMethods.multiSelectCheckbox(driver, Locators.checkbox);
   //WebElement male =driver.findElement(Locators.male);
  // ComonMethods.InputText(male,);
   
	}
}
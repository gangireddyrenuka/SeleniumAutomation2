package gmailAutomation;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import loginPage.ComonMethods;
import loginPage.Locators;

public class LoginGmail extends TestBaseClass {
	
	@Test(priority =1)
	public static void NewAccount() throws InterruptedException
	{
		
		WebElement uName=driver.findElement(GmailLocaters.uName);
		GmailCommonMethods.Inputtext(uName ,"devanshibogala@gmail.com");
		
		GmailCommonMethods.click(driver,GmailLocaters.nextBtn);
		
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(GmailLocaters.password);
		GmailCommonMethods.Inputtext(password,"devanshi@143");
		
	    GmailCommonMethods.click(driver,GmailLocaters.nextBtn2);
	  //WebElement fName = driver.findElement(GmailLocaters.fName);
		//GmailCommonMethods.Inputtext(fName,"devanshi");
		
		//WebElement lName = driver.findElement(GmailLocaters.lName);
		//GmailCommonMethods.Inputtext(lName, "Bogala");
		
		//WebElement uName = driver.findElement(GmailLocaters.uName);
		//GmailCommonMethods.Inputtext(uName, "devanshibogala@gmail.com");
		
		//WebElement password = driver.findElement(GmailLocaters.password);
		//GmailCommonMethods.Inputtext(password, "devanshi@143");
		
		//WebElement confpwd = driver.findElement(GmailLocaters.confpwd );
		//GmailCommonMethods.Inputtext(confpwd , "devanshi@143");
		
		//GmailCommonMethods.click(driver, GmailLocaters.nextBtn);
		
		//WebElement pNum = driver.findElement(GmailLocaters.pNum);
		//GmailCommonMethods.Inputtext(pNum , "9000906690");
		
		//GmailCommonMethods.click(driver, GmailLocaters.nextBtn2);
		
		//WebElement recMail = driver.findElement(GmailLocaters.recMail);
		//GmailCommonMethods.Inputtext(recMail , "gangireddyrenuka253@gmail.com");
		
		//WebElement month= driver.findElement(GmailLocaters.month);
		//GmailCommonMethods.Inputtext1(month , "November");
		
		//WebElement date= driver.findElement(GmailLocaters.date);
		//GmailCommonMethods.Inputtext(date , "20");
		
		//WebElement year= driver.findElement(GmailLocaters.year);
		//GmailCommonMethods.Inputtext(year , "2016");
		
		//WebElement gender=driver.findElement(GmailLocaters.gender);
		//GmailCommonMethods.Inputtext1(gender, "Female");
		
		
		//WebElement parent = driver.findElement(GmailLocaters.parent);
		//GmailCommonMethods.Inputtext(parent , "gangireddyrenuka253@gmail.com");
		
		//WebElement inBoxBtn = driver.findElement(GmailLocaters.inBoxBtn);
		//GmailCommonMethods.Inputtext(inbox , "gangireddyrenuka253@gmail.com");
		
	    
	}
	    
	
	     
  @Test(priority=3) 
  public static void SentMail()
	{
	   
	    GmailCommonMethods.click(driver, GmailLocaters.composeMail);
	    GmailCommonMethods.WindowHandle(driver, GmailLocaters.window);
	    
	    WebElement window=driver.findElement(GmailLocaters.window);
		GmailCommonMethods.Inputtext(window ,"gangireddyrenuka253@gmail.com");
			
		WebElement subject=driver.findElement(GmailLocaters.subject);
		GmailCommonMethods.Inputtext(subject ,"Hello");
		
		WebElement message=driver.findElement(GmailLocaters.message);
		GmailCommonMethods.Inputtext(message ,"hi i love you mummy");
		
		GmailCommonMethods.click(driver, GmailLocaters.sendMail);
	}
	
  @Test(priority=2) 
	public static void DeleteInbox()
  {
	    	
	    GmailCommonMethods.click(driver,GmailLocaters.inBoxBtn);
			
	     GmailCommonMethods.click(driver,GmailLocaters.inBox);
	     
	    GmailCommonMethods.click(driver, GmailLocaters.deleteBox);
	   
	}
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	



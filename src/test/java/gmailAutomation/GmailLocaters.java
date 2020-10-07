package gmailAutomation;

import org.openqa.selenium.By;

public class GmailLocaters extends TestBaseClass {
	
	//public static By fName = By.xpath("//input[@id='firstName']");
	
	//public static By lName = By.xpath("//input[@id='lastName']");
	
	//public static By uName = By.xpath("//input[@id='username']");
	
	//public static By password = By.xpath("//input[@name='Passwd']");
	
	//public static By confpwd = By.xpath("//input[@name='ConfirmPasswd']");
	
	//public static By nextBtn = By.xpath("//*[@id='accountDetailsNext']/span/span");
	
	//public static By pNum =By.xpath("//input[@id='phoneNumberId']");
	
	//public static By nextBtn2=By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[2]/div/div[1]/div/div/span/span");
	
//	public static By recMail=By.xpath("//input[@name='recoveryEmail']");
	
//	public static By month= By.xpath("//select[@id='month']");
	
	//public static By date= By.xpath("//input[@name='day']");
	
	//public static By year= By.xpath("//input[@name='year']");
	
	//public static By gender= By.xpath("//select[@id='gender']");
	
	//public static By parent=By.xpath("//input[@id='identifierId']");
	
	//public static By inBoxBtn=By.xpath("//a[@title='Inbox']");
	
	public static By uName = By.xpath("//*[@id='identifierId']");
	
	public static By nextBtn = By.xpath("//*[@id='identifierNext']/div/span/span");
	
	public static By password = By.xpath("//input[@type='password']");
	
	public static By nextBtn2 = By.xpath("//*[@id=\'passwordNext\']/div/span/span");
	
	public static By composeMail = By.xpath("//div[@class='T-I T-I-KE L3']");
	
    public static By window=By.cssSelector(".oj div textarea");
    
    public static By subject=By.cssSelector(".aoD.az6 input");
    
    public static By message=By.cssSelector(".Ar.Au div");
    
    public static By sendMail=By.cssSelector(".T-I.J-J5-Ji.aoO.v7.T-I-atl.L3");
    
    public static By inBoxBtn=By.xpath("//a[@title='Inbox']");
	
	public static By inBox=By.xpath("//div[@role='checkbox']");
	
	public static By deleteBox = By.xpath("//*[@id=':4']/div/div[1]/div[1]/div/div/div[2]/div[3]");
	
}

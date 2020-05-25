package loginPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ComonMethods extends TestBase
{
public static void InputText(WebElement s1,String s)
{
  s1.sendKeys(s);
}
 
public static void click(WebDriver driver,By Locators)
{
	driver.findElement(Locators).click();
}
public static void multiSelectCheckbox(WebDriver driver, By locator) {
	
	List<WebElement> checkBoxes = driver.findElements(locator);
	
	for(WebElement c1: checkBoxes )
	{
		c1.click();
	
}


}
public static void MouseAction(WebElement d, WebDriver s) {
	
	Actions act = new Actions(s);
	act.moveToElement(d).click().build().perform();
		
	}

	// TODO Auto-generated method stub
	
}

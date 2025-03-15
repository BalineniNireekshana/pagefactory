package Pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import Browser.browser;
import Locators.page1Objects;

public class page1 extends browser {
	 static page1Objects obj;
	
	public static String title() {
		return driver.getTitle();
	}
 
	public static void userNameEnter(String username) {
	
		obj=new page1Objects();
		wait.until(ExpectedConditions.elementToBeClickable(obj.username));
		obj.username.sendKeys(username);
		obj=new page1Objects();
		
        //driver.findElement(By.name("username")).sendKeys("Admin");
}
	
	
	public static void passwordEnter(String password) {
		obj.password.sendKeys(password);
			
        //driver.findElement(By.name("password")).sendKeys("admin123");
			
		
	}
	
	public static void clickLogin() {
		
			obj.loginbutton.click();
	       //driver.findElement(By.xpath("//button[@type='submit']")).click();
            
    }
		
	}


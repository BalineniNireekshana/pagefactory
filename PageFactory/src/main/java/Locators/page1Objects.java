package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Browser.browser;

public class page1Objects extends browser {
	
       public page1Objects() {
    	   PageFactory.initElements(driver, this);
       }
	    @FindBy(name = "username")
	    public  WebElement username;

	    @FindBy(name = "password")
	    public WebElement password;

	    @FindBy(xpath = "//button[@type='submit']")
	    public  WebElement loginbutton;

	    
	    }
	




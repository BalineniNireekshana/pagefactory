package Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Browser.browser;

public class page2objects extends browser {
	

	public page2objects() {
		PageFactory.initElements(driver, this);
	}

    @FindBy(css = ".oxd-text.oxd-text--span.oxd-main-menu-item--name")
    public   List<WebElement> list;

    

    //@FindBy(css = ".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")
    //public static  WebElement dashboardelement;
    @FindBy(xpath = "//span[text()='My Info']")
    public WebElement myInfoElement;
    
    @FindBy(css = ".oxd-userdropdown-name")  // Example: actual username element
    public WebElement usernameElement;
}

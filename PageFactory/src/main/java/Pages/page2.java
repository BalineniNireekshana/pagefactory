package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Browser.browser;
import Locators.page2objects;

public class page2 extends browser {
	static page2objects obj;
	
	public static String Username() {
		obj=new page2objects();
	     wait.until(ExpectedConditions.elementToBeClickable(obj.usernameElement));
	     return obj.usernameElement.getText();
	}
		
	public static void optionclick(String str)
	{
		
	    try {
	    	
	        //List<WebElement> list = page2objects.menuelements();
	        for(WebElement e :obj.list)
	        {
	            if(e.getText().equalsIgnoreCase(str))
	            {
	                e.click();
	                break;
	            }
	        }
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	        System.out.println("Click :" + e.getMessage());
	    }
	}
	
	public static void clickMyInfo() {
        wait.until(ExpectedConditions.elementToBeClickable(obj.myInfoElement));
        obj.myInfoElement.click();
    }
	}

	


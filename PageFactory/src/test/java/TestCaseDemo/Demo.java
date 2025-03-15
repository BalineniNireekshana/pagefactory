package TestCaseDemo;



import Browser.browser;
import Pages.page1;
import Pages.page2;
import Screenshot.capture;
//import Screenshot.capture;

public class Demo {

//	public static void main(String[] args) throws Exception {
//		browser.openBrowser();
//		browser.navigateToUrl(null);
//		Thread.sleep(3000);
//		
//		page1.userNameEnter("Admin");
//		page1.passwordEnter("admin123");
//		page1.clickLogin();
//		
//		page2.Username();
//		
//	     page2.clickMyInfo();
//		Thread.sleep(2000);;
//		//capture.screenShot("Title");
//		browser.closeBrowser();
//
//	}

	
	

		public static void main(String[] args) throws Exception {
			
			browser.openBrowser();
			browser.navigateToUrl();;
			Thread.sleep(5000);
			page1.userNameEnter("Admin");
			capture.screenShot("username");
			page1.passwordEnter("admin123");

			if(page1.title().equals("OrangeHRM"))
			{
				System.out.println("Title matched with expected");
			}
			else
			{
				System.out.println("Title is not matched with expected");
				
			}
			page1.clickLogin();
			
			if(page2.Username().equals("manda user"))
			{
				System.out.println("user matched with expected");
			}
			else
			{
				System.out.println("login user namepage2: "+page2.Username());
				
			}
			capture.screenShot("page2");
			page2.optionclick("time");
			
			browser.closeBrowser();
			

		}
}

package Stepdefinition;



import org.testng.Assert;

import Browser.browser;
import Pages.page1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class First {
	@Given("User open the browser")
	public void user_open_the_browser() throws Exception {
	    browser.openBrowser();
	}
	@And("User navigate to the {string} webpage")
	public void user_navigate_to_the_webpage(String string) throws Exception {
	   browser.navigateToUrl();
	}
	@Then("User verifies the title of the webpage")
	public void user_verifies_the_title_of_the_webpage() {
	    Assert.assertEquals(page1.title(),"OrangeHRM");
	}
	


	@And("User closes the browser")
	public void user_closes_the_browser() {
	    browser.closeBrowser();
	}
	
}

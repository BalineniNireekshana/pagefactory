package Stepdefinition;

import org.testng.Assert;

import Pages.page1;
import Pages.page2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Second {
	@When("User enters {string} the username")
	public void user_enters_the_username(String string) {
	   page1.userNameEnter("Admin");
	}

	@And("User enters {string} the password")
	public void user_enters_the_password(String string) {
	    page1.passwordEnter("admin123");
	}


	@And("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    page1.clickLogin();
	}

	@Then("User verifies the profile account")
	public void user_verifies_the_profile_account() {
	   //Assert.assertEquals(page2.Username(),"manda user");
	}


}

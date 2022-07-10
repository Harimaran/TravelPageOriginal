package testScripts;

import browserUtility.Browser;
import browserUtility.PageUtility;
import io.cucumber.java.en.*;
import pages.LogInPage;
import utility.PageAccessor;

public class LogInPageStepDef {
	
	LogInPage logInPage;
	
	@When("Enters {string}, {string}")
	public void enters(String email, String password) throws InterruptedException {
		logInPage = PageAccessor.getLogInPage();
		logInPage.enterEmail(email);
		logInPage.enterPassword(password);
		
	}
	
	
	@When("clicks LogInButton")
	public void clicks_log_in_button() {
		logInPage = PageAccessor.getLogInPage();
		logInPage.clickLogInBtn();
		
	}
	
	@Then("User should receive error message")
	public void user_should_be_logged_in_to_user_s_homepage() {
		Browser.refreshPage();
		
	}

}

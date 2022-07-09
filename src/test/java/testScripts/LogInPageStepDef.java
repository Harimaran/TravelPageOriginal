package testScripts;

import browserUtility.Browser;
import browserUtility.PageUtility;
import io.cucumber.java.en.*;
import pages.LogInPage;

public class LogInPageStepDef {
	
	LogInPage logInPage;
	
	@When("Enters {string}, {string}")
	public void enters(String email, String password) throws InterruptedException {
		logInPage = new LogInPage();
		logInPage.enterEmail(email);
		logInPage.enterPassword(password);
		
	}
	
	
	@When("clicks LogInButton")
	public void clicks_log_in_button() {
		
		if(logInPage == null) {
		logInPage = new LogInPage();
		}
		
		logInPage.clickLogInBtn();
		
	}
	@Then("User should receive error message")
	public void user_should_be_logged_in_to_user_s_homepage() {
		Browser.refreshPage();
		
	}

}

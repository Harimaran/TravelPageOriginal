package pages;

import browserUtility.Browser;
import browserUtility.PageUtility;
import pageObjects.LogInPageObjects;

public class LogInPage {
	
	LogInPageObjects logInPage;
	
	public LogInPage() {
		logInPage= new LogInPageObjects(Browser.driver);
	}

	public void enterEmail(String email) throws InterruptedException {
		PageUtility.switchTab("Login");
		logInPage.Email().sendKeys(email);	
		
	}
	
	public void enterPassword(String password) {
		logInPage.Password().sendKeys(password);
	}
	
	public void clickLogInBtn() {
		logInPage.LogInBtn().click();
	}
	
}

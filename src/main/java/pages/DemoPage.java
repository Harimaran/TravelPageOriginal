package pages;

import org.openqa.selenium.WebDriver;

import browserUtility.Browser;
import browserUtility.PageUtility;
import pageObjects.DemoPageObjects;

public class DemoPage{
	
	DemoPageObjects demo ;

	public DemoPage(){
		demo = new DemoPageObjects(Browser.driver);
	}
		
	public void clickLogInButton(){
		demo.LogInBtn.click();
	}
	
	public void clickSignUpBtn(){
		demo.SignUpBtn.click();
	}
	
	public boolean isDemoDisplayed() {
		return demo.Demo.isDisplayed();
	}
	
	public boolean isPricingDisplayed() {
		return demo.Pricing.isDisplayed();
	}
	
	public boolean isFeatureDisplayed() {
		return demo.Feature.isDisplayed();
	}
	
	public boolean isProductDisplayed() {
		return demo.Product.isDisplayed();
	}
	
	public boolean isDocsDisplayed() {
		return demo.Docs.isDisplayed();
	}
	
	public boolean isCompanyDisplayed() {
		return demo.Company.isDisplayed();
	}
	
	public void enterDemoFirstName(String fName) {
			PageUtility.scrollToElement(demo.DemoEmail);
			demo.DemoFirstName.sendKeys(fName);
	}
	
	public void enterDemoLastName(String lName) {
		demo.DemoLastName.sendKeys(lName);
}
	
	public void enterDemoBusinessName(String bName) {
		demo.DemoBusiessName.sendKeys(bName);
}

	public void enterDemoEmail(String email) {
		demo.DemoEmail.sendKeys(email);
}

	public void enterNewsletterEmail(String email) {
		PageUtility.scrollToElement(demo.NewsLetterMailId);
		demo.NewsLetterMailId.sendKeys(email);
	}
	
	public void clickNewsletterSubscription() {
		demo.SubscribeNewsLetter.click();
	}
	
}

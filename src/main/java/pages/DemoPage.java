package pages;

import org.openqa.selenium.WebDriver;

import browserUtility.Browser;
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
	
}

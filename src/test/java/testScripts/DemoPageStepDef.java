package testScripts;

import org.junit.Assert;

import browserUtility.Browser;
import io.cucumber.java.en.*;
import pages.DemoPage;
import utility.PageAccessor;

public class DemoPageStepDef {
	
	DemoPage demoPage;
	
	@Given("User navigates to {string}")
	public void user_navigates_to(String url) {
		Browser.gotoUrl(url);
	}
	
	@Given("User clicks on Sign Up button")
	public void user_clicks_on_sign_up_button() {
		demoPage = PageAccessor.getDemoPage();
		demoPage.clickSignUpBtn();
	}

	
	@When("Page loads completely")
	public void page_loads_completely() {
		String title = "Demo Script Test drive - PHPTRAVELS";
		
	}
	
	@When("User clicks on LogIn button")
	public void user_clicks_on_log_in_button() {
		demoPage = PageAccessor.getDemoPage();
		demoPage.clickLogInButton();
	}
	
	
	@Then("User should see all the available options")
	public void user_should_see_all_the_available_options() {
		demoPage = PageAccessor.getDemoPage();
		Assert.assertTrue(demoPage.isDemoDisplayed());
		Assert.assertTrue(demoPage.isPricingDisplayed());
		Assert.assertTrue(demoPage.isFeatureDisplayed());
		Assert.assertTrue(demoPage.isProductDisplayed());
		Assert.assertTrue(demoPage.isCompanyDisplayed());
		Assert.assertTrue(demoPage.isDocsDisplayed());
	}

}

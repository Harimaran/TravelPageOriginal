package testScripts;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.SignUpPage;

public class SignUpPageStepDef {

	SignUpPage signUpPage;
	
	@When("User Enters all the required details  *")
	public void user_enters_all_the_required_details(DataTable data) throws InterruptedException {
		
		if (signUpPage == null) signUpPage = new SignUpPage();
		
		Map<String, String> registrationData = data.asMap(String.class, String.class);		
		signUpPage.enterFirstName(registrationData.get("firstName"));
		signUpPage.enterLastName(registrationData.get("lastName"));
		signUpPage.enterEmail(registrationData.get("eMail"));
		signUpPage.enterPhone(registrationData.get("phone"));
		signUpPage.enterAddress1(registrationData.get("address1"));
		signUpPage.enterAddress2(registrationData.get("address2"));
		signUpPage.enterCity(registrationData.get("city"));
		signUpPage.enterState(registrationData.get("state"));
		signUpPage.enterPostalCode(registrationData.get("postalCode"));
		signUpPage.enterWhatsAppPhone(registrationData.get("whatsApp"));
		signUpPage.enterPassword(registrationData.get("password"));
		signUpPage.enterToConfirmPassword(registrationData.get("cPassword"));
		signUpPage.clickRegisterBtn();
		Thread.sleep(5000);
	}
	
	@When("User Enters all the required details")
	public void user_enters_all_the_required_details1(DataTable data) throws InterruptedException {
		
		if (signUpPage == null) signUpPage = new SignUpPage();
		
		List<Map<String, String>> registrationData = data.asMaps(String.class, String.class);	
		for(Map<String, String> itr : registrationData) {
			signUpPage.enterFirstName(itr.get("firstName"));
			signUpPage.enterLastName(itr.get("lastName"));
			signUpPage.enterEmail(itr.get("eMail"));
			signUpPage.enterPhone(itr.get("phone"));
			signUpPage.enterAddress1(itr.get("address1"));
			signUpPage.enterAddress2(itr.get("address2"));
			signUpPage.enterCity(itr.get("city"));
			signUpPage.enterState(itr.get("state"));
			signUpPage.enterPostalCode(itr.get("postalCode"));
			signUpPage.enterWhatsAppPhone(itr.get("whatsApp"));
			signUpPage.enterPassword(itr.get("password"));
			signUpPage.enterToConfirmPassword(itr.get("cPassword"));
			signUpPage.clickRegisterBtn();
			Thread.sleep(5000);
			
		}
		
		
		}

}

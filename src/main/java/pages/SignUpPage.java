package pages;

import browserUtility.Browser;
import browserUtility.PageUtility;
import pageObjects.SignUpPageObjects;

public class SignUpPage {
	
	SignUpPageObjects signUp;
	
	public SignUpPage() {
		signUp = new SignUpPageObjects(Browser.driver);
	}

	public void enterFirstName(String firstName) {
		PageUtility.switchTab("Register");
		signUp.FirstName.clear();
		signUp.FirstName.sendKeys(firstName);

	}
	
	public void enterLastName(String lastName) {
		signUp.LastName.clear();
		signUp.LastName.sendKeys(lastName);
	}
	
	public void enterEmail(String email) {
		signUp.Email.clear();
		signUp.Email.sendKeys(email);
	}
	
	public void enterPhone(String phone) {
		signUp.Phone.clear();
		signUp.Phone.sendKeys(phone);
	}
	
	public void enterAddress1(String addr1) {
		PageUtility.scrollToElement(signUp.State);
		signUp.AddressLine1.clear();
		signUp.AddressLine1.sendKeys(addr1);
	}

	public void enterAddress2(String addr2) {
		signUp.AddressLine2.clear();
		signUp.AddressLine2.sendKeys(addr2);
	}

	public void enterCity(String city) {
		signUp.City.clear();
		signUp.City.sendKeys(city);
	}

	public void enterState(String state) {
		signUp.State.clear();
		signUp.State.sendKeys(state);
	}

	public void enterPostalCode(String zipCode) {
		signUp.PostalCode.clear();
		signUp.PostalCode.sendKeys(zipCode);
	}
	
	public void enterWhatsAppPhone(String phone) {
		signUp.WhatAppPhone.clear();
		signUp.WhatAppPhone.sendKeys(phone);
	}
	
	public void enterPassword(String pass) {
		signUp.Password.clear();
		signUp.Password.sendKeys(pass);
	}
	
	public void enterToConfirmPassword(String pass) {
		signUp.ConfirmPassword.clear();
		signUp.ConfirmPassword.sendKeys(pass);
	}
	
	
	public void clickRegisterBtn() {
		signUp.Register.click();;
	}

	
}

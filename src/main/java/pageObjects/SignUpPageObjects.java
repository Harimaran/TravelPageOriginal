package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageObjects {
	
	WebDriver driver;

	public SignUpPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "inputFirstName")
	public WebElement FirstName;
	
	@FindBy(id = "inputLastName")
	public WebElement LastName;
	
	@FindBy(id = "inputEmail")
	public WebElement Email;
	
	@FindBy(id = "inputPhone")
	public WebElement Phone;
	
	@FindBy(how=How.ID, using="inputAddress1")
	public WebElement AddressLine1;

	@FindBy(how=How.ID, using="inputAddress2")
	public WebElement AddressLine2;
	
	@FindBy(how=How.NAME, using="city")
	public WebElement City;
	
	@FindBy(how=How.ID, using="stateinput")
	public WebElement State;

	@FindBy(how=How.ID, using="inputPostcode")
	public WebElement PostalCode;
	
	@FindBy(how=How.ID, using="inputCountry")
	public WebElement Country;
	
	@FindBy(how=How.ID, using="customfield2")
	public WebElement WhatAppPhone;
	
	@FindBy(how=How.ID, using="inputNewPassword1")
	public WebElement Password;
	
	@FindBy(how=How.ID, using="inputNewPassword2")
	public WebElement ConfirmPassword;
	
	@FindBy(xpath="//button[contains(text(),'Generate Password')]")
	public WebElement GeneratePassword;
	
	@FindBy(xpath="//input[@type='submit' and @value='Register']")
	public WebElement Register;
	
	
}


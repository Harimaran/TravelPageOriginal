package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageObjects {
	
	WebDriver driver;

	public LogInPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	By emailLoc= By.xpath("//input[@name='username']");
	By passwordLoc = By.id("inputPassword");
	By logInBtnLoc =By.id("login");
	
	public WebElement Email() {
		return driver.findElement(emailLoc);
	}
	
	public WebElement Password() {
		return driver.findElement(passwordLoc);
	}
	
	public WebElement LogInBtn() {
		return driver.findElement(logInBtnLoc);
	}
		
}

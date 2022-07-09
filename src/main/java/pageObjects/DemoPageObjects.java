package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DemoPageObjects{
	
	WebDriver driver;

	public DemoPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//a[text()='Demo']")
	public WebElement Demo;
	
	@FindBy(xpath = "//a[text()='Pricing']")
	public WebElement Pricing;
	
	@FindBy(xpath = "//span[text()='Features']")
	public WebElement Feature;
	
	@FindBy(xpath = "//span[text()='Product']")
	public WebElement Product;
	
	@FindBy(xpath = "//a[@href='https://docs.phptravels.com']")
	public WebElement Docs;
	
	@FindBy(xpath ="//span[text()='Company']")
	public WebElement Company;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//a[@href='https://phptravels.org/']")
	public WebElement LogInBtn;
	
	@CacheLookup
	@FindBy(how= How.XPATH,using = "//a[@href='https://phptravels.org/register.php']")
	public WebElement SignUpBtn;
	
}

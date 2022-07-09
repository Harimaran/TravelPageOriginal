package runner;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
	static ChromeDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo");
		
		
	
		By SignUp= By.xpath("//a[@href='https://phptravels.org/register.php']");
		driver.findElement(SignUp).click();
		switchTab1("Register");
		By FirstName = By.id("inputFirstName");
		driver.findElement(FirstName).sendKeys("NewName");
		switchTab1("Demo");
		By LogInBtn = By.xpath("//a[@href='https://phptravels.org/']");
		driver.findElement(LogInBtn).click();
		switchTab1("Login");
		
		By emailLoc= By.xpath("//input[@name='username']");
		By passwordLoc = By.id("inputPassword");
		By logInBtnLoc =By.id("login");
		
		driver.findElement(emailLoc).sendKeys("Email");
		driver.findElement(passwordLoc).sendKeys("Pass");
		driver.findElement(logInBtnLoc).click();;

		
	}
		public static void switchTab1(String tabName){
			String itrTabTitle = null;
			Set<String> windows = driver.getWindowHandles();
			
			for(String itrWindow :windows) {
				itrTabTitle = driver.switchTo().window(itrWindow).getTitle();
				if(itrTabTitle.contains(tabName))	break;
			}
		}

	}

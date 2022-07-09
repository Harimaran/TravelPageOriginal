package browserUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	public static WebDriver driver;
	
	public static WebDriver launchBrowser(){
		if(driver == null) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
		
		return driver;
		
	}
	
	public static void navigateBack() {
		driver.navigate().back();
	}
	
	public static void navigateForward() {
		driver.navigate().forward();
	}
	
	public static void refreshPage() {
		driver.navigate().refresh();
	}
	
	
	public static void closeTab(){
		driver.close();
	}

	public static void closeBrowser() {
		driver.quit();
	}
	
	public static void gotoUrl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
}

package browserUtility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertUtility {
	
	static WebDriver driver = Browser.driver;
	
	public static String getAlertMsg() {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}
	
	public static void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	

}

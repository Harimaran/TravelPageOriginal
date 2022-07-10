package browserUtility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertUtility {
	
	static WebDriver driver = Browser.driver;
	
	public static String getAlertMsg() {
		String alertMsg = switchToAlert().getText();
		return alertMsg;
	}
	
	public static void acceptAlert() {
		switchToAlert().accept();
	}
	
	static Alert switchToAlert(){
		Alert alert = driver.switchTo().alert();
		return alert;
	}

}

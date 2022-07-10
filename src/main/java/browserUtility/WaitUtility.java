package browserUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	
	static WebDriverWait wait;
	
	public static void waitUntilWebElementClickable (WebElement element) {
		wait = new WebDriverWait(Browser.driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}


}

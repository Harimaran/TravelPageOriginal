package browserUtility;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageUtility {
	
	static WebDriver driver = Browser.driver;
	static JavascriptExecutor js;
	
	public static void switchTab(String tabName){
		String itrTabTitle = null;
		Set<String> windows = driver.getWindowHandles();
		
		for(String itrWindow :windows) {
			itrTabTitle = driver.switchTo().window(itrWindow).getTitle();
			if(itrTabTitle.contains(tabName)) {
				break;
			}
		}
	}
	
	
	public static void scrollToElement(WebElement element) {
		js =  (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView()", element);
	}
	
}

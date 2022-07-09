package testScripts;

import browserUtility.Browser;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class PreRequisite {
	
	@BeforeAll
	public static void launchBrowser() {
		Browser.launchBrowser();
	}
	
	@AfterAll
	public static void quit() {
		Browser.closeBrowser();
	}

}

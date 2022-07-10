package utility;

import pages.DemoPage;
import pages.LogInPage;
import pages.SignUpPage;

public class PageAccessor {
	
	static DemoPage demoPage;
	static LogInPage logInPage;
	static SignUpPage	signUpPage;
	
	public static DemoPage getDemoPage() {
		demoPage = new DemoPage();
		return demoPage;
	}
	
	public static LogInPage getLogInPage() {
		logInPage = new LogInPage();
		return logInPage;
	}
	
	public static SignUpPage getSignUpPage() {
		signUpPage = new SignUpPage();
		return signUpPage;
	}
	
}

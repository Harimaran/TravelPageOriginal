package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@target/failedCases/failedInRun.txt",
		glue = "testScripts",
		dryRun = false,
		monochrome = true,
//		tags = "@demoReq",
		plugin= {"html:target/logIn.html", "rerun:target/failedCases/failedInRun.txt"}
		)

public class FailedTestRunner {

}

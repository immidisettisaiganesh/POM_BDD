package runnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/resources/features", 
		glue = {"stepDefinitions","Hooks"},
		plugin = {"pretty","html:target/report_project.html"},
		monochrome = true
		)

public class LoginRunnerFile extends AbstractTestNGCucumberTests {

}

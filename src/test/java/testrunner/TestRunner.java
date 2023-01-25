package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features"},
		glue = {"stepdefinition", "Hooks"},
				stepNotifications = true,
		monochrome = true,
		tags = "@login"
	
		)
public class TestRunner {

}

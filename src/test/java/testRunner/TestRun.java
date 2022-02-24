package testRunner;
//This is my test runner class

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/BackgroundColorSet.feature",
		glue="stepDefinitions.Steps",
		dryRun = true,
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		)
public class TestRun {

}
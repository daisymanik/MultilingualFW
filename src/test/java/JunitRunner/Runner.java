package JunitRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {
		"StepDefinition" }, dryRun = false, monochrome = true, plugin = { "pretty", "html:Report/cucumber",
				"json:Report/cucumber1.json" })

public class Runner {
	

}

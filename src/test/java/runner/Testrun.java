package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/featurefiles/SignUp.feature" },
					glue = "stepdefinitions",dryRun = false, monochrome = true,
					plugin = "html:target/Report/Luma.html")

public class Testrun {

}
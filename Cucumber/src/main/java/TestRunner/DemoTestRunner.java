package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="feature",
	glue= {"cucumberProject"},
	tags={"@login1","@data-driven1"})
public class DemoTestRunner {

}

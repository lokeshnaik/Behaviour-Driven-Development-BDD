package stepDefinationLoginScenarioOutline;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/HooksFeature/HooksLogin.feature",
		glue= {"hooksStepDefination"},
		plugin= {"pretty","html:target/HTMLReport/reports","json:target/cucumber.json"},
		monochrome = true,
		tags="@hooks"
		
		)
public class TestRunnerOfHooksDemo 
{

}

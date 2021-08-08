package stepDefinationLoginScenarioOutline;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features="src/test/resources/Feature/nopcommerceLogin.feature",
                  glue= {"stepDefinationLoginScenarioOutline"},
                  plugin= {"pretty","html:target/HTMLReport/reports","json:target/cucumber.json"},
                  monochrome= true,
                  tags="@smokeTest"
		)

public class TestRunnerOf_LoginScenarioOutline_NopCommerence 
{

}

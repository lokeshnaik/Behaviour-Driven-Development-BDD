package stepDefinationFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/Feature/AdactinLogin.feature",
        glue= {"stepDefinationFile"},
		plugin= {"pretty","json:target/reports.json","html:target/reports.html"},
		monochrome = true,
		tags="@smoke")
public class TestRunner
{

}

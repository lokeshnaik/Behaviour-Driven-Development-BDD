package stepDefinations;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"src/test/java/stepDefinations"}
, plugin= {"pretty","html:target/HTMLReport/reports","json:target/cucumber.json"}		
,monochrome= true,tags="@smoke")

public class TestRunnerClass {

}



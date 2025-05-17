package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Shivansh\\Documents\\Latest\\src\\test\\java\\Features\\Regexp.feature",
glue="StepDefinition",monochrome=true,
plugin= {"pretty","html:target/cucumber1.html","json:target\\JsonReports\\Cucumber2.json","junit:target\\JunitReport\\Cucumber3.xml"},
dryRun=false)

public class Regex_RunnerTest {

	
}

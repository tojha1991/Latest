package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Eclipse\\Archive\\CucumberTestNG\\src\\test\\java\\Features\\Valid_login.feature",
glue="StepDefinition",monochrome=true,
plugin= {"pretty","html:target/cucumber.html","json:target\\JsonReports\\Cucumber.json","junit:target\\JunitReport\\Cucumber.xml"},
dryRun=false)

public class Valid_LoginRunnerTest {

	
}

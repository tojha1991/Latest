package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Shivansh\\Documents\\Latest\\src\\test\\java\\Features\\data_drivenTesting_ScenariOutln.feature",
glue="StepDefinition",monochrome=true,
plugin= {"pretty","html:target/cucumber11.html","json:target\\JsonReports\\Cucumber22.json","junit:target\\JunitReport\\Cucumber33.xml"},
dryRun=false)

public class Scenariootln_Datadriven_RunnerTest {

	
}

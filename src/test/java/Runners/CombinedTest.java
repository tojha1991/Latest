package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Shivansh\\Documents\\Latest\\src\\test\\java\\Features\\CombinedScenarios.feature",
glue="StepDefinition",monochrome=true,
plugin= {"pretty","html:target/Tags.html"},
dryRun=false,
tags="@Login or @InvalidLogin")
public class CombinedTest {

}

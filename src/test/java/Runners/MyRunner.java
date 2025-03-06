package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="/Users/tripurariojha/eclipse-workspace/CucumberTestNG/src/test/java/Features/datadriven.feature",
glue="StepDefinition",
plugin= {"pretty","html:target/cucumber.html"})
public class MyRunner extends AbstractTestNGCucumberTests {

}

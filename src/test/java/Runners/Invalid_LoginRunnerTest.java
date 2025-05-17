package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Eclipse\\Archive\\CucumberTestNG\\src\\test\\java\\Features\\Invalid_login.feature",
glue="StepDefinition",
plugin= {"pretty","html:target/cucumber1.html"})

public class Invalid_LoginRunnerTest {

	
}

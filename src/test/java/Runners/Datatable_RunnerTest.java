package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Shivansh\\Documents\\Latest\\src\\test\\java\\Features\\DataTable.feature",
glue="StepDefinition",monochrome=true,
plugin= {"pretty","html:target/cucumber12.html","json:target\\JsonReports\\Cucumber22.json","junit:target\\JunitReport\\Cucumber43.xml"},
dryRun=false,
tags="@Sanity")

public class Datatable_RunnerTest {

}

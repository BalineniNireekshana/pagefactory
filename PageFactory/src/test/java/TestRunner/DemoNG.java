package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\Feature\\Sample3.feature",
glue= {"Stepdefinition","Hooks"},
plugin= {"pretty","html:target/cucumberreport/report.html"},
monochrome=true)
//tags=("@SmokeTest or @SystemTest"),


public class DemoNG extends AbstractTestNGCucumberTests {

}

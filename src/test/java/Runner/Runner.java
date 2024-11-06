package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/test/resources/Features",
        glue = {"Steps"},
        tags = "customerLogin",
        plugin = {"pretty:Reports/cucumber.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        publish = true)
public class Runner extends AbstractTestNGCucumberTests {

}

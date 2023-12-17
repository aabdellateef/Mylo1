package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/test/resources/F1.feature",
        glue = "Steps",
        plugin = {"pretty", "html:reports/cucumber-reports"}
)

public class Runner extends AbstractTestNGCucumberTests {
}

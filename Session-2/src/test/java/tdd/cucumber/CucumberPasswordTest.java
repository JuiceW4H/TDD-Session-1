package tdd.cucumber;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/pass",
        glue = "tdd.cucumber",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true
)

public class CucumberPasswordTest {
}

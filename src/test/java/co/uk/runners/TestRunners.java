package co.uk.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/co/uk/features"},
        glue = {"co/uk/hooks","co/uk/stepDefinitions"},
        tags = "not @exclude",
        plugin = {"pretty"},
        publish = true
)

public class TestRunners {
}

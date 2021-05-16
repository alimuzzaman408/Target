package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/resources/Features",
  glue = "step_definition",
  //plugin = {"pretty","summary","html:target/CucumberReports/reports.html"},
plugin = {"pretty","summary", "json:target/cucumber.json"},
  publish = true, monochrome = true, dryRun = false
  //tags = "@smokeTesting"
)
public class TestRunner {
}

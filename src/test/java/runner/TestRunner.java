package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/resources/Features",
  glue = "step_definition",
  //plugin = {"pretty","summary","html:target/CucumberReports/reports.html"},
  plugin = {"pretty","summary", "json:target/cucumber.json","html:target/CucumberReports/reports.html"},
  publish = true, monochrome = true, dryRun = true
  //tags = "@smokeTesting"
)
public class TestRunner {
}

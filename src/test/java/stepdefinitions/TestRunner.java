package stepdefinitions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", 
glue = {"stepdefinitions"}, monochrome = true,
plugin = {"pretty","junit:target/JUnit Reports/report.xml"})
public class TestRunner {

}

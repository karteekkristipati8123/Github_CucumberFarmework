package stepdefinitions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature_files_with_Tags", 
glue = {"stepdefinitions"}, 
tags = "@Smoke and not @Regression"
)
public class TestRunner_with_singleTag {

}

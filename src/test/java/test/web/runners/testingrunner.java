package test.web.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/testing.feature"},
        glue = {"test.web.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class testingrunner {
}

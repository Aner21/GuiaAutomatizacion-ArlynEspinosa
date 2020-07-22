package co.com.choucair.certificacion.Reto1ANER.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/AutomationDemo.feature",
        tags = "@stories1",
        glue = "co.com.choucair.certificacion.Reto1ANER.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
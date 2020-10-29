package co.com.banistmo.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/co.com.banistmo.certificacion.features/search.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "co.com.banistmo.certificacion.stepdefinitions")

public class Search {
}

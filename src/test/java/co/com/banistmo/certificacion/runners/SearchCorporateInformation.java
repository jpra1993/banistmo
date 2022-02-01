package co.com.banistmo.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/search_corporate_information.feature",
        snippets = SnippetType.CAMELCASE,
        glue = {"co.com.banistmo.certificacion.stepdefinitions", "co.com.banistmo.certificacion.hooks"},
        dryRun = false)
public class SearchCorporateInformation {
}

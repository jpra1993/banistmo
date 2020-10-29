package co.com.banistmo.certificacion.stepdefinitions;

import co.com.banistmo.certificacion.tasks.Write;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SearchStepDefinitions {
    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("The user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.banistmo.com/wps/portal/banistmo/personas/"));
    }

    @When("^he types the words for the search (.*)$")
    public void heTypesTheWordsForTheSearch(String parameter) {
        OnStage.theActorInTheSpotlight().attemptsTo(Write.onField(parameter));
    }

    @Then("^he finds the result of his search$")
    public void heFindsTheResultOfHisSearch() {

    }

}

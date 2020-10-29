package co.com.banistmo.certificacion.stepdefinitions;

import co.com.banistmo.certificacion.exceptions.ValidatePdfException;
import co.com.banistmo.certificacion.questions.LocatedPDF;
import co.com.banistmo.certificacion.tasks.Download;
import co.com.banistmo.certificacion.tasks.Navigate;
import co.com.banistmo.certificacion.utils.constans.MessagesException;
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

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class ValidatePdfStepDefinitions {

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("The user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.banistmo.com/wps/portal/banistmo/personas/"));
    }

    @Given("^the user navigates to the banikids page$")
    public void theUserNavigatesToTheBanikidsPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Navigate.toBanikidsPage());
    }

    @When("^he downloads generated pdf$")
    public void heDownloadsGeneratedPdf() {
        OnStage.theActorInTheSpotlight().attemptsTo(Download.theDepositAccountFeesFile());
    }

    @Then("^he should see the correct pdf file$")
    public void heShouldSeeTheCorrectPdfFile() {
        OnStage.theActorInTheSpotlight().should(seeThat(LocatedPDF.isVisible(),
             containsString("banistmo_tarifario_junio+2018"))
            .orComplainWith(ValidatePdfException.class, MessagesException.VALIDATE_PDF));
    }
}
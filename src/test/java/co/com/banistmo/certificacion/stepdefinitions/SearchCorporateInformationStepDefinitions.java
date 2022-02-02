package co.com.banistmo.certificacion.stepdefinitions;

import co.com.banistmo.certificacion.exceptions.PdfException;
import co.com.banistmo.certificacion.questions.LocatedPDF;
import co.com.banistmo.certificacion.tasks.Enters;
import co.com.banistmo.certificacion.tasks.GeneratePdf;
import co.com.banistmo.certificacion.tasks.Navigate;
import co.com.banistmo.certificacion.utils.MessagesException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class SearchCorporateInformationStepDefinitions {
    @Given("^the user navigates to the section acerca de nosotros$")
    public void theUserNavigatesToTheSectionAcercaDeNosotros() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Navigate.toAcercaDeNosotrosPage());
    }

    @When("^the user enters to the sustainability section$")
    public void theUserEntersToTheSustainabilitySection() {
        OnStage.theActorInTheSpotlight().attemptsTo(Enters.toSustainabilityPage());
    }

    @When("^the user generates the desired document about sustainability$")
    public void theUserGeneratesTheDesiredDocumentAboutSustainability() {
        OnStage.theActorInTheSpotlight().attemptsTo(GeneratePdf.sustainable());
    }

    @Then("^the user should see the correct pdf file$")
    public void theUserShouldSeeTheCorrectPdfFile() {
        OnStage.theActorInTheSpotlight().should(seeThat(LocatedPDF.isVisible(),
                containsString("Sostenible")).orComplainWith(PdfException.class, MessagesException.PDF));
    }
}

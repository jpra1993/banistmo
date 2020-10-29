package co.com.banistmo.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

public class LocatedPDF implements Question<String> {

    @Step("{0} validates the generated pdf")
    @Override
    public String answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        return driver.getCurrentUrl();
    }

    public static LocatedPDF isVisible() {
        return new LocatedPDF();
    }
}

package co.com.banistmo.certificacion.tasks;

import co.com.banistmo.certificacion.interactions.WindowsChange;
import co.com.banistmo.certificacion.userinterface.SustainabilityPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GeneratePdf implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SustainabilityPage.SUSTAINABLE_GENERATION_BTN),
                Click.on(SustainabilityPage.NINTH_EDITION_PDF_BTN),
                WindowsChange.withTittle("Generación Sostenible Edición 9"));
    }

    public static GeneratePdf sustainable() {
        return Tasks.instrumented(GeneratePdf.class);
    }
}

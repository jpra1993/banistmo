package co.com.banistmo.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.banistmo.certificacion.userinterface.HomePage.*;

public class Navigate implements Task {

    @Step("{0} navigate to banikids page")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PRODUCTS_AND_SERVICES),
                Click.on(BANIKIDS_OPTION));
    }

    public static Navigate toBanikidsPage() {
        return Tasks.instrumented(Navigate.class);
    }
}

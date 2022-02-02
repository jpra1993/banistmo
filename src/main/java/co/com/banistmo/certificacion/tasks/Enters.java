package co.com.banistmo.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.banistmo.certificacion.userinterface.AboutUsPage.*;

public class Enters implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CORPORATE_INFORMATION_BTN), Click.on(SUSTAINABILITY_BTN));
    }

    public static Enters toSustainabilityPage() {
        return Tasks.instrumented(Enters.class);
    }
}

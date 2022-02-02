package co.com.banistmo.certificacion.tasks;

import co.com.banistmo.certificacion.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Navigate implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.ABOUT_US_BTN));
    }

    public static Navigate toAcercaDeNosotrosPage() {
        return Tasks.instrumented(Navigate.class);
    }
}

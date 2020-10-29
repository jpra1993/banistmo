package co.com.banistmo.certificacion.tasks;

import co.com.banistmo.certificacion.interactions.WindowsChange;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.banistmo.certificacion.userinterface.BanikidsPage.DEPOSIT_ACCOUNT_FEES;
import static co.com.banistmo.certificacion.userinterface.BanikidsPage.RATES_AND_FEES;

public class Download implements Task {

    @Step("{0} downloads the deposit account fees")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RATES_AND_FEES),
                Click.on(DEPOSIT_ACCOUNT_FEES),
                WindowsChange.withTittle("banistmo_tarifario_junio 2018"));
    }

    public static Download theDepositAccountFeesFile() {
        return Tasks.instrumented(Download.class);
    }
}

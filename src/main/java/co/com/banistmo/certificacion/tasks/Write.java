package co.com.banistmo.certificacion.tasks;

import co.com.banistmo.certificacion.interactions.WindowsChange;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static co.com.banistmo.certificacion.userinterface.BanikidsPage.DEPOSIT_ACCOUNT_FEES;
import static co.com.banistmo.certificacion.userinterface.BanikidsPage.RATES_AND_FEES;
import static co.com.banistmo.certificacion.userinterface.HomePage.SEARCH_PARAMETER;

public class Write implements Task {
    //private String = parameter;

    //public Write(String parameter){
        //this.parameter = parameter;
    //}

    @Step("{0} writes parameter of search")
    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(Enter.theValue(parameter).into(SEARCH_PARAMETER));
    }

    public static Write onField(String parameter) {
        return Tasks.instrumented(Write.class, parameter);
    }
}

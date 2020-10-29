package co.com.banistmo.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class BanikidsPage {
    private BanikidsPage() {
        throw new UnsupportedOperationException();
    }

    public static final Target RATES_AND_FEES =
            Target.the("Rates and fees button")
                    .locatedBy("//a[text()='Tasas y tarifas']");

    public static final Target DEPOSIT_ACCOUNT_FEES =
            Target.the("Deposit account fees button")
                    .locatedBy("(//img[@alt='Descargar PDF'])[1]");
}

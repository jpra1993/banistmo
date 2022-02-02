package co.com.banistmo.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target ABOUT_US_BTN =
            Target.the("About us button")
                    .locatedBy("//*[text()='Acerca de nosotros']");
}

package co.com.banistmo.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AboutUsPage {
    public static final Target CORPORATE_INFORMATION_BTN =
            Target.the("Corporate information button")
                    .locatedBy("//a[@class='dropdown-toggle']");

    public static final Target SUSTAINABILITY_BTN =
            Target.the("Sustainability button")
                    .locatedBy("(//a[text()='Sostenibilidad'])[1]");
}

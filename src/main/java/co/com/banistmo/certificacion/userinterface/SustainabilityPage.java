package co.com.banistmo.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SustainabilityPage {
    public static final Target SUSTAINABLE_GENERATION_BTN =
            Target.the("Sustainable generation button")
                    .locatedBy("//*[@href='#tab5']");

    public static final Target NINTH_EDITION_PDF_BTN =
            Target.the("ninth edition pdf button")
                    .locatedBy("(//img[@alt='Descargar PDF'])[1]");
}

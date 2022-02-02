package co.com.banistmo.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PdfPage {

    public static final Target PDF_TITLE_LBL =
            Target.the("Pdf title")
                    .locatedBy("//*[contains(text(), 'Sostenible')]");
}

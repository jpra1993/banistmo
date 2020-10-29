package co.com.banistmo.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    private HomePage() {
        throw new UnsupportedOperationException();
    }

    public static final Target PRODUCTS_AND_SERVICES =
            Target.the("Products and Services field")
                    .locatedBy("//a[text()='Productos & Servicios']");

    public static final Target BANIKIDS_OPTION =
            Target.the("Choose banikids option")
                    .locatedBy("//a[text()='Banikids']");
}

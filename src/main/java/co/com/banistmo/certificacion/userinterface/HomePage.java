package co.com.banistmo.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

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

    public static final Target SEARCH_PARAMETER =
            Target.the("Search field")
                    .located(By.id("termino"));
}

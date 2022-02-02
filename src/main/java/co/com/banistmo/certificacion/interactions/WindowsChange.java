package co.com.banistmo.certificacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowsChange implements Interaction {
    private String tittle;

    public WindowsChange(String tittle) {
        this.tittle = tittle;
    }
    
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Set<String> screensLists = driver.getWindowHandles();
        for (String screen : screensLists) {
            driver.switchTo().window(screen);
            if (driver.getTitle().contains(tittle))
                break;
        }
    }

    public static WindowsChange withTittle(String tittle) {
        return Tasks.instrumented(WindowsChange.class, tittle);
    }
}

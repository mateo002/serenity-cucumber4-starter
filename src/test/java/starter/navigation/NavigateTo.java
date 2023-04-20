package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class NavigateTo {
    public static Performable theSauceDemoGoHomePage() {
        return Task.where("{0} opens the Wikipedia home page",
                Open.browserOn().the(SauceDemoHomePage.class));
    }


}

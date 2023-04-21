package starter.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowsingTheWeb;

public class TitleAvalible implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BrowsingTheWeb.as(actor).find(FinancialOverview.TITLE).getText();
    }
}

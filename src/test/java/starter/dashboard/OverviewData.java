package starter.dashboard;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class OverviewData {
    public static Question<String> titleAvalible(){
        return actor -> TextContent.of(FinancialOverview.TITLE).viewedBy(actor).asString().trim();
    }
    public static Question<String> productsCar(){
        return actor -> TextContent.of(FinancialOverview.PRODUCTS_CAR).viewedBy(actor).asString().trim();
    }

}

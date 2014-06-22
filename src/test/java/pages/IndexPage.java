package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class IndexPage {

    public IndexPage() {
        $("h2").shouldHave(text("Hello World!"));
    }

    public void clickCreateOrder() {
        $("a").click();
    }
}
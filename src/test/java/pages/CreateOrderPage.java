package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CreateOrderPage {

    public CreateOrderPage() {
        $("h2").shouldHave(text("Create Order"));
    }

    public void createOrder(String item1, String amount1) {
        $("form input[name='item']").val(item1);
        $("form input[name='amount']").val(amount1);
        $("form input[type='submit']").click();
    }
}
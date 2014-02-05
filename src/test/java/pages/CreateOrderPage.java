package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CreateOrderPage {

    public CreateOrderPage() {
        $("h2").shouldBe(text("Create Order"));
    }

    public void createOrder(String item1, String amount1) {
        $("form").find("input[name='item']").sendKeys(item1);
        $("form").find("input[name='amount']").sendKeys(amount1);
        $("form").find("input[type='submit']").click();
    }
}
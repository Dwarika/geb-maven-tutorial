package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreateOrderPage;
import pages.IndexPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class IndexStepDefs {

    @Given("I'm at the index page")
    public void imAtTheIndexPage() {
        open("/", IndexPage.class);
    }

    @When("I click 'Create Order'")
    public void iClickCreateOrder() {
        page(IndexPage.class).clickCreateOrder();
    }

    @Then("I see the create order page")
    public void iSeeTheCreateOrderPage() {
        page(CreateOrderPage.class);
    }

    @Given("I'm at the create order page")
    public void imAtTheCreateOrderPage() {
        page(CreateOrderPage.class);
    }

    @When("I enter (.*) (.*)")
    public void iEnterItemAmount(String item, String amount) {
        page(CreateOrderPage.class).createOrder(item, amount);
    }

}
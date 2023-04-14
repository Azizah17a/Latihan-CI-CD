package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Sepulsa.payment;

public class paymentSteps {
    @Steps
    starter.Sepulsa.payment payment;

    @Given("I am on the page to choose a payment method")
    public void choosePaymentMethod() {
        payment.choosePaymentMethod();
    }
    @When("I enter Buyer Detail information")
    public void enterDetailInformation() {
        payment.enterDetailInformation();
    }
    @And("I choose Kredivo payment method")
    public void chooseKredivo() {
        payment.chooseKredivo();
    }
    @Then("I go to the Kredivo payment page")
    public void Kredivo() {
        payment.Kredivo();
    }
    @And("I choose Gopay payment method")
    public void chooseGopay() {
        payment.chooseGopay();
    }

    @Then("I go to the Gopay payment page")
    public void Gopay() {
        payment.Gopay();
    }
    @And("I choose Dana payment method")
    public void chooseDana() {
        payment.chooseDana();
    }

    @Then("I go to the Dana payment page")
    public void Dana() {
        payment.Dana();
    }
    @And("I choose ShopeePay payment method")
    public void chooseShopeePay() {
        payment.chooseShopeePay();
    }

    @Then("I go to the ShopeePay payment page")
    public void ShopeePay() {
        payment.ShopeePay();
    }
}
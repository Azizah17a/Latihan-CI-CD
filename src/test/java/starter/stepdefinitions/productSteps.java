package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Sepulsa.product;

public class productSteps {
    @Steps
    starter.Sepulsa.product product;
    @Given("I am on the Sepulsa.com home page")
    public void sepulsaHomePage(){
        product.sepulsaHomePage();
    }
    @When("I click icon Pulsa button")
    public void clickPulsaButton(){
        product.clickPulsaButton();
    }
    @And("I enter my number phone")
    public void enterNumberPhone(){
        product.enterNumberPhone();
    }
    @And("I choose an available product")
    public void chooseAvailableProduct(){
        product.chooseAvailableProduct();
    }
    @Then("I was redirected to the payment method")
    public void redirectedPaymentMethod(){
        product.redirectedPaymentMethod();
    }



    @When("I click icon voucher game button")
    public void clickVoucherGame(){
        product.clickVoucherGame();
    }
    @And("I choose the desired game")
    public void chooseDesiredGame(){
        product.chooseDesiredGame();
    }


    @When("I click icon listrik pln button")
    public void clickListrikPln(){
        product.clickListrikPln();
    }
    @And("I enter valid PLN Meter Number or Customer ID")
    public void enterValidNumberPln(){
        product.enterValidNumberPln();
    }



    @And("I enter invalid PLN Meter Number or Customer ID")
    public void enterInvalidNumberPln(){
        product.enterInvalidNumberPln();
    }
    @Then("Notification appears that the number is incorrect or blocked or expired")
    public void notificationWarning(){
        product.notificationWarning();
    }
}

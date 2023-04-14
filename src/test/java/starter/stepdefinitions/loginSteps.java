package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Sepulsa.login;

public class loginSteps {
    @Steps
    login login;
    @Given("I am on the Sepulsa.com login page")
    public void onTheLoginPage(){
        login.onTheloginPage();
    }
    @When("I enter my valid username and password")
    public void enterValidUsernameAndPassword(){
        login.enterValidUsernameAndPassword();
    }
    @And("I click on the login button")
    public void clickLoginButton(){
        login.clickLoginButton();
    }
    @Then("see a message Welcome to Sepulsa")
    public void welcomeToSepulsa(){
        login.welcomeToSepulsa();
    }
    @When("I enter my invalid username and password")
    public void enterInvalidUsernameAndPassword(){
        login.enterInvalidUsernameAndPassword();
    }
    @Then("I should see an error message Invalid username or password")
    public void errorMassageInvalidUsernamePassword(){
        login.errorMassageInvalidUsernamePassword();
    }
    @When("I click on the Forgot Password button")
    public void clickForgotPasswordButton(){
        login.clickForgotPasswordButton();
    }
    @And("I enter my registered email address")
    public void enterRegisteredEmail(){
        login.enterRegisteredEmail();
    }
    @And("I click on the Reset Password button")
    public void clickResetPassword(){
        login.clickResetPassword();
    }
    @Then("I should receive an email with instructions on resetting my password")
    public void receiveEmailResettingPassword(){
        login.receiveEmailResettingPassword();
    }
    @When("I click guest button")
    public void clickGuestButton(){
        login.clickGuestButton();
    }
    @Then("Go to main page sepulsa")
    public void mainPageSepulsa(){
        login.mainPageSepulsa();
    }
}

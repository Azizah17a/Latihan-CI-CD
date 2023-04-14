package starter.Sepulsa;
import net.thucydides.core.annotations.Step;

public class login {
    @Step("I am on the Sepulsa.com login page")
    public void onTheloginPage(){
        System.out.println("I am on the Sepulsa.com login page");
    }
    @Step("I enter my valid username and password")
    public void enterValidUsernameAndPassword() {
        System.out.println("I enter my valid username and password");
    }
    @Step("I click on the login button")
    public void clickLoginButton() {
        System.out.println("I click on the login button");
    }
    @Step("see a message Welcome to Sepulsa")
    public void welcomeToSepulsa() {
        System.out.println("see a message Welcome to Sepulsa");
    }
    @Step("I enter my invalid username and password")
    public void enterInvalidUsernameAndPassword() {
        System.out.println("I enter my invalid username and password");
    }
    @Step("I should see an error message Invalid username or password")
    public void errorMassageInvalidUsernamePassword() {
        System.out.println("I should see an error message Invalid username or password");
    }
    @Step("I click on the Forgot Password button")
    public void clickForgotPasswordButton() {
        System.out.println("I click on the Forgot Password button");
    }
    @Step("I enter my registered email address")
    public void enterRegisteredEmail() {
        System.out.println("I enter my registered email address");
    }
    @Step("I click on the Reset Password button")
    public void clickResetPassword() {
        System.out.println("I click on the Reset Password button");
    }
    @Step("I should receive an email with instructions on resetting my password")
    public void receiveEmailResettingPassword() {
        System.out.println("I should receive an email with instructions on resetting my password");
    }



    @Step("I click guest button")
    public void clickGuestButton() {
        System.out.println("I click guest button");
    }
    @Step("Go to main page sepulsa")
    public void mainPageSepulsa() {
        System.out.println("Go to main page sepulsa");
    }
}


package starter.Sepulsa;
import net.thucydides.core.annotations.Step;
public class product {
    @Step("I am on the Sepulsa.com home page")
    public void sepulsaHomePage(){
        System.out.println("I am on the Sepulsa.com home page");
    }
    @Step("I click icon Pulsa button")
    public void clickPulsaButton(){
        System.out.println("I click icon Pulsa button");
    }
    @Step("I enter my number phone")
    public void enterNumberPhone(){
        System.out.println("I enter my number phone");
    }
    @Step("I choose an available product")
    public void chooseAvailableProduct(){
        System.out.println("I choose an available product");
    }
    @Step("I was redirected to the payment method")
    public void redirectedPaymentMethod(){
        System.out.println("I was redirected to the payment method");
    }
    @Step("I click icon voucher game button")
    public void clickVoucherGame(){
        System.out.println("I click icon voucher game button");
    }
    @Step("I choose the desired game")
    public void chooseDesiredGame(){
        System.out.println("I choose the desired game");
    }
    @Step("I click icon listrik pln button")
    public void clickListrikPln(){
        System.out.println("I click icon listrik pln button");
    }
    @Step("I enter valid PLN Meter Number or Customer ID")
    public void enterValidNumberPln(){
        System.out.println("I enter valid PLN Meter Number or Customer ID");
    }
    @Step("I enter invalid PLN Meter Number or Customer ID")
    public void enterInvalidNumberPln(){
        System.out.println("I enter invalid PLN Meter Number or Customer ID");
    }
    @Step("Notification appears that the number is incorrect or blocked or expired")
    public void notificationWarning(){
        System.out.println("Notification appears that the number is incorrect or blocked or expired");
    }
}

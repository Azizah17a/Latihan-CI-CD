package starter.Sepulsa;
import net.thucydides.core.annotations.Step;
public class payment {
    @Step("I am on the page to choose a payment method")
    public void choosePaymentMethod(){
        System.out.println("I am on the page to choose a payment method");
    }
    @Step("I enter Buyer Detail information")
    public void enterDetailInformation(){
        System.out.println("I enter Buyer Detail information");
    }
    @Step("I choose Kredivo payment method")
    public void chooseKredivo(){
        System.out.println("I choose Kredivo payment method");
    }
    @Step("I go to the Kredivo payment page")
    public void Kredivo(){
        System.out.println("I go to the Kredivo payment page");
    }
    @Step("I choose Gopay payment method")
    public void chooseGopay(){
        System.out.println("I choose Gopay payment method");
    }
    @Step("I go to the Gopay payment page")
    public void Gopay(){
        System.out.println("I go to the Gopay payment page");
    }
    @Step("I choose Dana payment method")
    public void chooseDana(){
        System.out.println("I choose Dana payment method");
    }
    @Step("I go to the Dana payment page")
    public void Dana(){
        System.out.println("I go to the Dana payment page");
    }
    @Step("I choose ShopeePay payment method")
    public void chooseShopeePay(){
        System.out.println("I choose ShopeePay payment method");
    }
    @Step("I go to the ShopeePay payment page")
    public void ShopeePay(){
        System.out.println("I go to the ShopeePay payment page");
    }
}

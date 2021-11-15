package payment;

public class PaypalPaymentStrategy implements Payment {

    @Override
    public String pay(double price) {
        return "PayPal payment completed! ( -" + price + "$ )";
    }
}

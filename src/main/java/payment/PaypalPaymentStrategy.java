package payment;

public class PaypalPaymentStrategy implements Payment {

    @Override
    public void pay(double price) {
        System.out.println("PayPal payment completed! ( -" + price + "$ )");
    }
}

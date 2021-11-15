package payment;

public class CreditCardPaymentStrategy implements Payment {

    @Override
    public String pay(double price) {
        return "Card payment completed! ( -" + price + "$ )";
    }
}

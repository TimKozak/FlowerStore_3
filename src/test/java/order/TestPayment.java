package order;

import payment.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPayment {
    CreditCardPaymentStrategy cardPayment = new CreditCardPaymentStrategy();

    @Test
    void pay() {
        assertEquals("Card payment completed! ( -42.2$ )", cardPayment.pay(42.2));
    }
}

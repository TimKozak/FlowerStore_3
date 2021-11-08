import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import payment.*;
import delivery.*;
import decorators.*;
import flowerstore.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOrder {
    private Order order = new Order();

    @BeforeEach
    void setUp() {
        Delivery delivery = new DHLDeliveryStartegy();
        Payment payment = new CreditCardPaymentStrategy();

        Flower rose = new Flower();
        rose.setFlowerType(FlowerType.ROSE);
        rose.setPrice(50);

        Item rose_with_ribbon = new RibbonDecorator(rose);

        order.addItem(rose_with_ribbon);
        order.setDeliveryStrategy(delivery);
        order.setPaymentStrategy(payment);
        order.processOrder();
    }

    @Test
    void calculateTotalPrice() {
        assertEquals(90, order.calculateTotalPrice());
    }

}
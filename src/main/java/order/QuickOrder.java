package order;
import delivery.*;
import flowerstore.*;
import payment.*;
import java.util.LinkedList;

public class QuickOrder {

    public static Order quickOrderConstructor(LinkedList<Item> flowers, Payment payment, Delivery delivery) {
        return new Order(flowers, payment, delivery);
    }
}

package order;

import decorators.RibbonDecorator;
import flowerstore.Flower;
import flowerstore.Item;
import org.junit.jupiter.api.Test;
import delivery.DHLDeliveryStartegy;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDelivery {
    DHLDeliveryStartegy delivery = new DHLDeliveryStartegy();
    Flower rose = new Flower();
    Item rose_with_ribbon = new RibbonDecorator(rose);
    List<Item> itemsToDeliver = Collections.singletonList(rose_with_ribbon);

    @Test
    void deliver() {
        assertEquals("Card payment completed! ( -42.2$ )", delivery.deliver(itemsToDeliver));
    }
}


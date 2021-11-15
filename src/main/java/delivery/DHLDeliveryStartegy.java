package delivery;

import flowerstore.Item;
import java.util.List;

public class DHLDeliveryStartegy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        return "Your order is being delivered by DHL";
    }
}

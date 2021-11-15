package delivery;

import flowerstore.Item;

import java.util.List;

public class PostDeliveryStartegy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        return "Your order is being delivered by UkrPoshta";
    }
}

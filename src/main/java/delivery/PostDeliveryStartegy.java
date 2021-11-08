package delivery;

import flowerstore.Item;

import java.util.List;

public class PostDeliveryStartegy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        System.out.println("Your order is being delivered by UkrPoshta");
    }
}

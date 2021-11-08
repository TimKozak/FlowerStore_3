package order;

import delivery.Delivery;
import flowerstore.Item;
import payment.Payment;
import java.util.LinkedList;

public class Order {
    private LinkedList<Item> items = new LinkedList<>();
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment paymentMethod){
        payment = paymentMethod;
    }
    public void setDeliveryStrategy(Delivery deliveryMethod){
        delivery = deliveryMethod;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;

        for (Item item : items) {
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }

    public void processOrder() {
        double price = this.calculateTotalPrice();
        payment.pay(price);
        delivery.deliver(items);
    }

    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }
}

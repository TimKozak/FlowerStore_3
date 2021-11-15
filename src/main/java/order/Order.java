package order;

import delivery.*;
import flowerstore.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import users.*;
import payment.*;
import java.util.LinkedList;

@AllArgsConstructor @Getter @Setter
public class Order {
    private LinkedList<Item> flowers = new LinkedList<>();
    private LinkedList<User> users = new LinkedList<>();
    private Payment payment;
    private Delivery delivery;
    private String status = "No status";

    public Order() {
    }

    public Order(LinkedList<Item> flowers, Payment payment, Delivery delivery) {
        this.flowers = flowers;
        this.payment = payment;
        this.delivery = delivery;
    }

    public void setPaymentStrategy(Payment paymentMethod) {
        payment = paymentMethod;
    }

    public void setDeliveryStrategy(Delivery deliveryMethod) {
        delivery = deliveryMethod;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;

        for (Item item : flowers) {
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }

    public void processOrder() {
        double price = this.calculateTotalPrice();
        payment.pay(price);
        delivery.deliver(flowers);
    }

    public void addItem(Item item) {
        this.flowers.add(item);
    }

    public void removeItem(Item item) {
        this.flowers.remove(item);
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void removeUser(User user) {
        this.users.remove(user);
    }

    public void notifyUsers() {
        for (User user : users) {
            user.update(this.status);
        }
    }

    public void order() {
        notifyUsers();
    }
}

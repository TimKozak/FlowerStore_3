package flowerstore;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack extends Item {
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    public double getPrice() {
        return flower.getPrice() * amount;
    }

    public void getDescription() {
        System.out.println("Flower pack of " + amount + " " + flower.getFlowerType() + "s");
    }
}

package flowerstore;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;

@Getter @Setter
public class FlowerBucket extends Item {
    private LinkedList<FlowerPack> flowerPacks;
    private double price = 0;

    public FlowerBucket(LinkedList<FlowerPack> flowerPacks) {
        flowerPacks = new LinkedList<>(flowerPacks);
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }
        this.setPrice(price);
    }

    @Override
    public void getDescription() {
        System.out.println("Flower Bucket costs " + price);
    }
}

package flowerstore;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Flower extends Item {
    private FlowerType flowerType;
    private Color color;
    private double price;
    private double sepalLength;

    public Flower() {
    }

    @Override
    public void getDescription() {
        System.out.println("" + color + " " + flowerType + " priced at" + price);
    }
}

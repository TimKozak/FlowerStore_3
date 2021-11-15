package flowers;

import flowerstore.Flower;
import flowerstore.FlowerBucket;
import flowerstore.FlowerPack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFlowerBucket {
    private FlowerBucket flowerBucket;

    @BeforeEach
    void setUp() {
        Flower flower = new Flower();
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, 10);
        LinkedList<FlowerPack> flowerPacks = new LinkedList<>();
        flowerPacks.add(flowerPack);
        flowerBucket = new FlowerBucket(flowerPacks);
    }

    @Test
    void getPrice() {
        assertEquals(100.00, flowerBucket.getPrice());
    }

}


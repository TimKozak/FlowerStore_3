package flowers;

import flowerstore.Flower;
import flowerstore.FlowerPack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFlowerPack {
    private FlowerPack flowerPack;

    @BeforeEach
    void setUp() {
        Flower flower = new Flower();
        flower.setPrice(10);
        flowerPack = new FlowerPack(flower, 10);
    }

    @Test
    void getPrice() {
        assertEquals(100.00, flowerPack.getPrice());
    }

}

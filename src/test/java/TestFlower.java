import flowerstore.Flower;
import flowerstore.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFlower {
    private Flower flower;

    @BeforeEach
    void setUp() {
        flower = new Flower();
        flower.setPrice(10);
        flower.setFlowerType(FlowerType.CHAMOMILE);
    }

    @Test
    void getFlowerType() {
        assertEquals(FlowerType.CHAMOMILE, flower.getFlowerType());
    }

}

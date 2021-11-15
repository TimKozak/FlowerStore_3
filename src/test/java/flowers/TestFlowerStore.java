package flowers;

import flowerstore.Flower;
import flowerstore.FlowerStore;
import flowerstore.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFlowerStore {
    private Flower[] flowers = new Flower[4];
    private FlowerStore flowerStore = new FlowerStore(new Flower[4]);

    @BeforeEach
    void setUp() {
        Flower rose = new Flower();
        rose.setFlowerType(FlowerType.ROSE);

        Flower rose1 = new Flower();
        rose1.setFlowerType(FlowerType.ROSE);

        Flower chamomile = new Flower();
        chamomile.setFlowerType(FlowerType.CHAMOMILE);

        Flower chamomile1 = new Flower();
        chamomile1.setFlowerType(FlowerType.CHAMOMILE);

        flowers[0] = rose;
        flowers[1] = rose1;
        flowers[2] = chamomile;
        flowers[3] = chamomile1;

        flowerStore.setFlowerArray(flowers);

    }

    @Test
    void getPrice() {
        assertEquals("Search Completed!", flowerStore.flowerSearch(flowers, FlowerType.CHAMOMILE));
    }

}
package flowerstore;

import flowerstore.Flower;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
public class FlowerStore {
    @Setter @Getter
    private Flower[] flowerArray;

    public String flowerSearch(Flower[] flowerArray, FlowerType flType ) {

        List<Flower> flowerBucketList = Arrays.asList(flowerArray);

        flowerBucketList.stream()
                .filter(flower -> flower.getFlowerType().equals(flType) )
                .forEach(System.out::println);

        return "Search Completed!";
    }
}

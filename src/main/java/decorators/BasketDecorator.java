package decorators;
import flowerstore.Item;

public class BasketDecorator extends ItemDecorator{
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 4;
    }
    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("+4 for the basket");
    }
}

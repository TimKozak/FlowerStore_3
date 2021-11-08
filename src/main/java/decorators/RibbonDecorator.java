package decorators;
import flowerstore.Item;

public class RibbonDecorator extends ItemDecorator{
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 40;
    }
    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("+4- for the ribbon");
    }
}
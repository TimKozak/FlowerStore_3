package decorators;
import flowerstore.Item;

public class PaperDecorator extends ItemDecorator{
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 13;
    }
    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("+13 for the paper");
    }
}
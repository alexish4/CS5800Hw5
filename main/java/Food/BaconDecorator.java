package Food;

public class BaconDecorator extends ToppingDecorator {
    public BaconDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Bacon";
    }
}

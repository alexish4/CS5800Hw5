package Food;

public class ChiliDecorator extends ToppingDecorator {
    public ChiliDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chili";
    }
}

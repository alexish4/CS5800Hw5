package Food;

public class CheeseDecorator extends ToppingDecorator {
    public CheeseDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }
}

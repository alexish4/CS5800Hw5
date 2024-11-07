package Food;

public class Burger implements FoodItem {
    private double basePrice;

    public Burger(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public double getPrice() {
        return basePrice;
    }

    @Override
    public String getDescription() {
        return "Burger";
    }
}

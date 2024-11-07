package Food;

public class HotDog implements FoodItem {
    private double basePrice;

    public HotDog(double basePrice) {
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
        return "Hot Dog";
    }
}

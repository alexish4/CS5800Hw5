import Food.*;
import Order.LoyaltyDiscount;
import Order.Order;

public class FoodDriver {
    public static void main(String[] args) {
        foodDriver();
    }

    public static void foodDriver() {
        double baseBurgerPrice = 5.0;
        double baseFriesPrice = 3.0;
        double baseHotdogPrice = 4.0;

        FoodItem burger1 = new Burger(baseBurgerPrice);
        FoodItem burger2 = new Burger(baseBurgerPrice);

        FoodItem fries1 = new Fries(baseFriesPrice);
        FoodItem fries2 = new Fries(baseFriesPrice);
        FoodItem fries3 = new Fries(baseFriesPrice);

        FoodItem hotdog1 = new HotDog(baseHotdogPrice);
        FoodItem hotdog2 = new HotDog(baseHotdogPrice);

        // Add toppings using decorators
        burger1 = new CheeseDecorator(burger1);
        burger1 = new BaconDecorator(burger1);
        fries1 = new CheeseDecorator(fries1);

        hotdog1 = new ChiliDecorator(hotdog1);
        hotdog1 = new CheeseDecorator(hotdog1);

        burger2 = new ChiliDecorator(burger2);
        fries2 = new CheeseDecorator(fries2);
        hotdog2 = new ChiliDecorator(hotdog2);

        fries3 = new CheeseDecorator(fries3);
        fries3 = new BaconDecorator(fries3);
        fries3 = new ChiliDecorator(fries3);

        // Create an order and add items
        Order order1 = new Order();
        order1.addFoodItem(burger1);
        order1.addFoodItem(fries1);

        Order order2 = new Order();
        order2.addFoodItem(hotdog1);

        Order order3 = new Order();
        order3.addFoodItem(burger2);
        order3.addFoodItem(fries2);
        order3.addFoodItem(hotdog2);

        Order order4 = new Order();
        order4.addFoodItem(fries3);

        LoyaltyDiscount bronze = new LoyaltyDiscount("Bronze");
        LoyaltyDiscount silver = new LoyaltyDiscount("Silver");
        LoyaltyDiscount gold = new LoyaltyDiscount("Gold");

        order1.setLoyaltyDiscount(bronze);
        order2.setLoyaltyDiscount(silver);
        order3.setLoyaltyDiscount(gold);

        order1.printOrder();
        order2.printOrder();
        order3.printOrder();
        order4.printOrder();
    }
}

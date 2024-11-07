package Order;

import Food.FoodItem;

import java.util.ArrayList;

public class Order {
    private ArrayList<FoodItem> foodItems = new ArrayList<>();
    private LoyaltyDiscount loyaltyDiscount;

    public ArrayList<FoodItem> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(ArrayList<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }

    public LoyaltyDiscount getLoyaltyDiscount() {
        return loyaltyDiscount;
    }

    public void setLoyaltyDiscount(LoyaltyDiscount loyaltyDiscount) {
        this.loyaltyDiscount = loyaltyDiscount;
    }

    public void addFoodItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    public double calculateTotal() {
        double total = 0;
        for (FoodItem foodItem : foodItems) {
            total += foodItem.getPrice();
        }

        if(loyaltyDiscount != null) {
            total -= total * loyaltyDiscount.getDiscountRate();
        }

        return total;
    }

    public String printOrder() {
        StringBuilder orderDetails = new StringBuilder();
        for (FoodItem foodItem : foodItems) {
            orderDetails.append(foodItem.getDescription()).append(": ").append(foodItem.getPrice()).append("\n");
        }

        if (loyaltyDiscount != null) {
            orderDetails.append("Discount Rate is ").append(loyaltyDiscount.getDiscountRate()).append("\n");
        }

        orderDetails.append("Total: ").append(calculateTotal()).append("\n");

        System.out.println(orderDetails.toString());

        return orderDetails.toString();
    }

}

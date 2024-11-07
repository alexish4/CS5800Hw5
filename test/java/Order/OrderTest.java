package Order;

import Food.Burger;
import Food.FoodItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    private Order order;
    private FoodItem burger;
    private LoyaltyDiscount loyaltyDiscount;

    @BeforeEach
    void setUp() {
        order = new Order();
        burger = new Burger(5.0);
    }

    @Test
    void setLoyaltyDiscount() {
        loyaltyDiscount = new LoyaltyDiscount("Silver");
        order.setLoyaltyDiscount(loyaltyDiscount);
        assertEquals(loyaltyDiscount, order.getLoyaltyDiscount());
    }

    @Test
    void addFoodItem() {
        order.addFoodItem(burger);
        assertTrue(order.getFoodItems().contains(burger));
    }

    @Test
    void calculateTotal() {
        order.addFoodItem(burger);
        LoyaltyDiscount loyaltyDiscount = new LoyaltyDiscount("Gold");
        order.setLoyaltyDiscount(loyaltyDiscount);
        double expectedTotal = 5.0 - (5.0 * 0.15);
        assertEquals(expectedTotal, order.calculateTotal());
    }

    @Test
    void printOrder() {
        order.addFoodItem(burger);
        LoyaltyDiscount bronzeDiscount = new LoyaltyDiscount("Bronze");
        order.setLoyaltyDiscount(bronzeDiscount);

        // Expected output string
        String expectedOutput = "Burger: 5.0\n" +
                "Discount Rate is 0.05\n" +
                "Total: 4.75\n";

        assertEquals(expectedOutput, order.printOrder());
    }
}
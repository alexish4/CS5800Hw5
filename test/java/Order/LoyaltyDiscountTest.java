package Order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoyaltyDiscountTest {
    private LoyaltyDiscount loyaltyDiscount;

    @BeforeEach
    void setUp() {
        loyaltyDiscount = new LoyaltyDiscount("Bronze");
    }

    @Test
    void setLoyaltyStatus() {
        loyaltyDiscount.setLoyaltyStatus("Silver");
        assertEquals("Silver", loyaltyDiscount.getLoyaltyStatus());
    }

    @Test
    void setDiscountRate() {
        loyaltyDiscount.setDiscountRate(0.05);
        assertEquals(0.05, loyaltyDiscount.getDiscountRate());
    }

    @Test
    void setDiscountBasedOffOfStatus() {
        loyaltyDiscount.setLoyaltyStatus("Bronze");
        loyaltyDiscount.setDiscountBasedOffOfStatus();
        assertEquals(0.05, loyaltyDiscount.getDiscountRate());

        // Test with Silver status
        loyaltyDiscount.setLoyaltyStatus("Silver");
        loyaltyDiscount.setDiscountBasedOffOfStatus();
        assertEquals(0.1, loyaltyDiscount.getDiscountRate());

        // Test with Gold status
        loyaltyDiscount.setLoyaltyStatus("Gold");
        loyaltyDiscount.setDiscountBasedOffOfStatus();
        assertEquals(0.15, loyaltyDiscount.getDiscountRate());

        // Test with invalid status
        loyaltyDiscount.setLoyaltyStatus("Platinum"); // Non-existent loyalty level
        loyaltyDiscount.setDiscountBasedOffOfStatus();
        assertEquals(0.0, loyaltyDiscount.getDiscountRate());
    }
}
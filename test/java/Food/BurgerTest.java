package Food;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BurgerTest {
    private Burger burger;

    @BeforeEach
    void setUp() {
        burger = new Burger(6.0);
    }

    @Test
    void setBasePrice() {
        burger.setBasePrice(5.0);
        assertEquals(5.0, burger.getBasePrice());
    }
}
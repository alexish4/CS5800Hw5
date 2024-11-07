package Food;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FriesTest {
    private Fries fries;

    @BeforeEach
    void setUp() {
        fries = new Fries(4.0);
    }

    @Test
    void setBasePrice() {
        fries.setBasePrice(5.0);
        assertEquals(5.0, fries.getBasePrice());
    }
}
package Food;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotDogTest {
    private HotDog hotDog;

    @BeforeEach
    void setUp() {
        hotDog = new HotDog(5.0);
    }

    @Test
    void setBasePrice() {
        hotDog.setBasePrice(3.0);
        assertEquals(3.0, hotDog.getBasePrice());
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiscountCalculatorTest {
    @Test
    void shouldCalculateSmartphoneDiscount() {
        Smartphone smartphone = new Smartphone("Xiaomi", 2000.0);

        DiscountCalculator discountCalculator = new DiscountCalculator(5.0);

        assertEquals(100, discountCalculator.applyDiscount(smartphone), 0.1);
    }

    @Test
    void shouldCalculateComputerDiscount() {
        Computer computer = new Computer("Positivo", 3000.0);

        DiscountCalculator discountCalculator = new DiscountCalculator(15.0);

        assertEquals(550, discountCalculator.applyDiscount(computer), 0.1);
    }

    @Test
    void shouldCalculateHeadsetDiscount() {
        Headset headset = new Headset("Logitech", 160.0);

        DiscountCalculator discountCalculator = new DiscountCalculator(7.0);

        assertEquals(31.2, discountCalculator.applyDiscount(headset), 0.1);
    }
}

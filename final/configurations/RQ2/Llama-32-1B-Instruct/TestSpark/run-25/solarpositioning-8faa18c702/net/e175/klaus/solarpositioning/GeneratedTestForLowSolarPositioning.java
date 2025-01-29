package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestForLowSolarPositioning {

    public double estimate(LocalDate forDate) {
        return pow(1.0, 10.0);
    }

    @Test
    public void TestForLowSolarPositioning() {
        assertEquals(8.9e-07, estimate(LocalDate.parse("2024-01-01")), 0.01);
    }
}

public class Helper {

    public static double pow(double a, int b) {
        return Math.pow(a, b);
    }

}
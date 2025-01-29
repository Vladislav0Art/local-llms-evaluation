package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestForNoSolarPositioning {

    public double estimate(LocalDate forDate) {
        return pow(1.0, 10.0);
    }

    @Test
    public void TestForNoSolarPositioning() {
        assertEquals(7.9e-07, estimate(LocalDate.parse("2024-01-01")), 0.01);
    }

}
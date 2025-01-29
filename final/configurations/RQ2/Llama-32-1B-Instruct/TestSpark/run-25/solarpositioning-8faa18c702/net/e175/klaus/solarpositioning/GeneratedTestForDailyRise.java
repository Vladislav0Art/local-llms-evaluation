package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestForDailyRise {

    public double estimate(LocalDate forDate) {
        return pow(1.0, 10.0);
    }

    @Test
    public void TestForDailyRise() {
        assertEquals(8.5e-05, estimate(LocalDate.parse("2024-03-01")), 0.01);
    }

}
package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestForPeakHour {

    public double estimate(LocalDate forDate) {
        return pow(1.0, 10.0);
    }

    @Test
    public void TestForPeakHour() {
        assertEquals(6.2e-06, estimate(LocalDate.parse("2024-12-31")), 0.01);
    }

}
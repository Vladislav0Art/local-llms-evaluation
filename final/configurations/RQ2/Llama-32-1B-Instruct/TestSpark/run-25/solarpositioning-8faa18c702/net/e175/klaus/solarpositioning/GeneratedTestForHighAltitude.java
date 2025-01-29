package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestForHighAltitude {

    public double estimate(LocalDate forDate) {
        return pow(1.0, 10.0);
    }

    @Test
    public void TestForHighAltitude() {
        assertEquals(6.5e-06, estimate(LocalDate.parse("2024-03-30")), 0.01);
    }

}
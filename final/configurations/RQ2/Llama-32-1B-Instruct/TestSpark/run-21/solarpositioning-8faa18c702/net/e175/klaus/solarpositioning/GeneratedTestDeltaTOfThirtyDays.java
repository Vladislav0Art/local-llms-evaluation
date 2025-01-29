package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class GeneratedTestDeltaTOfThirtyDays {

    @Test
    public void testDeltaTOfThirtyDays() {
        LocalDate forDate = LocalDate.of(2024, 3, 1);
        double actual = DeltaT.estimate(forDate);
        double expected = pow(86400 * 30, 2); // assuming delta t is thirty days squared twice
        assertEquals(expected, actual, 0.001);
    }

}
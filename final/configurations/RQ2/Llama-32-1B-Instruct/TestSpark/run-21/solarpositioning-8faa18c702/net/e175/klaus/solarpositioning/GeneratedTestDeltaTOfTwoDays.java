package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class GeneratedTestDeltaTOfTwoDays {

    @Test
    public void testDeltaTOfTwoDays() {
        LocalDate forDate = LocalDate.of(2024, 3, 1);
        double actual = DeltaT.estimate(forDate);
        double expected = pow(86400, 2); // assuming delta t is two days squared
        assertEquals(expected, actual, 0.001);
    }

}
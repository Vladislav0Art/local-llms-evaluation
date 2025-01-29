package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class GeneratedTestDeltaTOfOneDay {

    @Test
    public void testDeltaTOfOneDay() {
        LocalDate forDate = LocalDate.of(2024, 3, 1);
        double actual = DeltaT.estimate(forDate);
        double expected = 86400; // assuming delta t is one day
        assertEquals(expected, actual, 0.001);
    }

}
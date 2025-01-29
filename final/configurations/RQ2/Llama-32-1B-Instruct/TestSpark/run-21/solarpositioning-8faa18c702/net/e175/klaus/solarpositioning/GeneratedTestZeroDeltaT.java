package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class GeneratedTestZeroDeltaT {

    @Test
    public void testZeroDeltaT() {
        LocalDate forDate = LocalDate.of(2024, 3, 1);
        double actual = DeltaT.estimate(forDate);
        double expected = 0.0; // assuming delta t is zero
        assertEquals(expected, actual, 0.001);
    }

}
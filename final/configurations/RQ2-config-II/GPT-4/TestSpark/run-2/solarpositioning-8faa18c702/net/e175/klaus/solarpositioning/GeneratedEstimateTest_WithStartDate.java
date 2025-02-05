package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateTest_WithStartDate {

    @Test
    public void estimateTest_WithStartDate() {
        LocalDate start = LocalDate.of(1900, 1, 1);
        double expected = -2.72;  // Assuming expected output based on certain implementation
        double delta = 0.01;  // Delta for assertEquals for double
        assertEquals(expected, DeltaT.estimate(start), delta);
    }

}
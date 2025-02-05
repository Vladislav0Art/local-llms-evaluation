package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateTest_WithEndDate {

    @Test
    public void estimateTest_WithEndDate() {
        LocalDate end = LocalDate.of(2100, 12, 31);
        double expected = 72.0;  // Assuming expected output based on certain implementation
        double delta = 0.01;  // Delta for assertEquals for double
        assertEquals(expected, DeltaT.estimate(end), delta);
    }

}
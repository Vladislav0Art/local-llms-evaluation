package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateTest_WithRandomMiddleDate {

    @Test
    public void estimateTest_WithRandomMiddleDate() {
        LocalDate date = LocalDate.of(2000, 5, 15);
        double expected = 32.1;  // Assuming expected output based on certain implementation
        double delta = 0.01;  // Delta for assertEquals for double
        assertEquals(expected, DeltaT.estimate(date), delta);
    }

}
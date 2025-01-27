package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;

public class GeneratedEstimateValidDateReturnsDeltaT {

    @Test
    public void estimateValidDateReturnsDeltaT() {
        LocalDate forDate = LocalDate.of(2022, 1, 15);
        double expected = 1.0; // delta-T value for the given date (assuming a fixed value)
        double actual = DeltaT.estimate(forDate);
        assertEquals(expected, actual, 0.000001); // tolerance
    }

}
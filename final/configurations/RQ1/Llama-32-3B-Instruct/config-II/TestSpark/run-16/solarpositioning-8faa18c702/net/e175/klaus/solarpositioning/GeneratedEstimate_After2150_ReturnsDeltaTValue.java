package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimate_After2150_ReturnsDeltaTValue {

    @Test
    public void estimate_After2150_ReturnsDeltaTValue() {
        LocalDate forDate = LocalDate.of(2250, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertTrue(result >= -20 && result <= 32 * pow(((forDate.getYear() - 1820) / 100), 2));
    }

}
package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateSameDay SameDay Test {

    @Test
    public void estimateSameDay

    SameDay Test() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(-0.0027259202931020436, result, 0.000001);
    }

}
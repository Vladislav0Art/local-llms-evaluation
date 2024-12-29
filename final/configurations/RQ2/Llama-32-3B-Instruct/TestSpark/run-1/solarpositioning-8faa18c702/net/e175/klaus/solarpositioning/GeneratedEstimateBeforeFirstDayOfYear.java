package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.lang.Math;

public class GeneratedEstimateBeforeFirstDayOfYear {

    @Test
    public void estimateBeforeFirstDayOfYear() {
        LocalDate beforeFirstDayOfYear = LocalDate.of(2022, 12, 26).minusDays(1);
        double result = DeltaT.estimate(beforeFirstDayOfYear);
        double expected = -1.0 / 14400.0;
        assertEquals(expected, result, 1e-9);
    }

}
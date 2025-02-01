package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearGreaterThan2150Test {

    private static final double MAX_ERROR = 0.0001;

    @Test
    public void estimateYearGreaterThan2150Test() {
        double result = DeltaT.estimate(LocalDate.of(2151, 1, 1));
        assertEquals(result, -20.000112, MAX_ERROR);
    }

}
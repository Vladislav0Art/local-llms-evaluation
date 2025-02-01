package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearLessThan1941Test {

    private static final double MAX_ERROR = 0.0001;

    @Test
    public void estimateYearLessThan1941Test() {
        double result = DeltaT.estimate(LocalDate.of(1940, 1, 1));
        assertEquals(result, 19.65745, MAX_ERROR);
    }

}
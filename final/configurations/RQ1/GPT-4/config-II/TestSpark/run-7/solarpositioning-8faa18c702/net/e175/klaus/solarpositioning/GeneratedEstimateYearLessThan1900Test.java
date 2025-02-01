package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearLessThan1900Test {

    private static final double MAX_ERROR = 0.0001;

    @Test
    public void estimateYearLessThan1900Test() {
        double result = DeltaT.estimate(LocalDate.of(1899, 1, 1));
        assertEquals(result, 1.67418, MAX_ERROR);
    }

}
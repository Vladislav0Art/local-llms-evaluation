package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearLessThan500Test {

    private static final double MAX_ERROR = 0.0001;

    @Test
    public void estimateYearLessThan500Test() {
        double result = DeltaT.estimate(LocalDate.of(0, 1, 1));
        assertEquals(result, 10583.6, MAX_ERROR);
    }

}
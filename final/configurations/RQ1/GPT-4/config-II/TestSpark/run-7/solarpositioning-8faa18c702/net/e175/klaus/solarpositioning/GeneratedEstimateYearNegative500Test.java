package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearNegative500Test {

    private static final double MAX_ERROR = 0.0001;

    @Test
    public void estimateYearNegative500Test() {
        double result = DeltaT.estimate(LocalDate.of(-500, 1, 1));
        assertEquals(result, -20.0, MAX_ERROR);
    }

}
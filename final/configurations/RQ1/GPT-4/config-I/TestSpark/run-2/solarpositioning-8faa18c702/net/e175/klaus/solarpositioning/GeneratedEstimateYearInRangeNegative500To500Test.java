package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateYearInRangeNegative500To500Test {

    @Test
    public void estimateYearInRangeNegative500To500Test() {
        LocalDate forDate = LocalDate.of(499, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > 5000);
    }

}
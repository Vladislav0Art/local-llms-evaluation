package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateYearInRange1900To1920Test {

    @Test
    public void estimateYearInRange1900To1920Test() {
        LocalDate forDate = LocalDate.of(1910, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > 0);
    }

}
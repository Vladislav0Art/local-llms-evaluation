package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateYearInRangeFrom1986to2005Test {

    @Test
    public void estimateYearInRangeFrom1986to2005Test() {
        LocalDate forDate = LocalDate.of(1995, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > 60);
    }

}
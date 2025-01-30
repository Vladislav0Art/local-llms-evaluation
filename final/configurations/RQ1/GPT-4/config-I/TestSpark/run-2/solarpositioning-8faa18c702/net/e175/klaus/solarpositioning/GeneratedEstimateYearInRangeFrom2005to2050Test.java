package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateYearInRangeFrom2005to2050Test {

    @Test
    public void estimateYearInRangeFrom2005to2050Test() {
        LocalDate forDate = LocalDate.of(2030, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > 70);
    }

}
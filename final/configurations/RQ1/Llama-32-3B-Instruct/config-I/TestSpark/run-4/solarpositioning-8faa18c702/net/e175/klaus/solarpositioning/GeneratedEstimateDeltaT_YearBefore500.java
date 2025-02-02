package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_YearBefore500 {

    @Test
    public void EstimateDeltaT_YearBefore500() {
        final LocalDate forDate = LocalDate.of(-499, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(10583.6, deltaT, 0.001);
    }

}
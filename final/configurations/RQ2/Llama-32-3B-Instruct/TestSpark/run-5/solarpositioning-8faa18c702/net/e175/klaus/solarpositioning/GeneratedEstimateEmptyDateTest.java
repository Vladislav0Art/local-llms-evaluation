package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateEmptyDateTest {

    @Test
    public void estimateEmptyDateTest() {
        LocalDate forDate = null;
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(Double.NaN, actualDeltaT, 0.0);
    }

}
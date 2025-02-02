package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltalSimpleYearLessThan1500Test {

    @Test
    public void estimateDeltalSimpleYearLessThan1500Test() {
        LocalDate forDate = LocalDate.of(-1500, 1, 1);
        double expectedDeltaT = -20;
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(expectedDeltaT, actualDeltaT, 0.01);
    }

}
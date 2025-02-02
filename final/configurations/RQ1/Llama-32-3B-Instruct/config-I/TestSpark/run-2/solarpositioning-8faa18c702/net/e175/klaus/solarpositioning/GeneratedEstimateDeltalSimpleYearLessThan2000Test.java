package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltalSimpleYearLessThan2000Test {

    @Test
    public void estimateDeltalSimpleYearLessThan2000Test() {
        LocalDate forDate = LocalDate.of(-100, 1, 1);
        double expectedDeltaT = -20;
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(expectedDeltaT, actualDeltaT, 0.01);
    }

}
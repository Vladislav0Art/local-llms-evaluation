package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_SingleYearWithin_1500 {

    @Test
    public void estimateDeltaT_SingleYearWithin_1500() {
        DeltaT deltaT = new DeltaT();
        LocalDate forDate = LocalDate.of(1200, 1, 1);
        assertEquals(1018.49, deltaT.estimate(forDate), 0.01);
    }

}
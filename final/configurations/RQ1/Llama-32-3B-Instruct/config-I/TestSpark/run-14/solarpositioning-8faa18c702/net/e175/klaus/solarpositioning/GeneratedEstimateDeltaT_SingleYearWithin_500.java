package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_SingleYearWithin_500 {

    @Test
    public void estimateDeltaT_SingleYearWithin_500() {
        DeltaT deltaT = new DeltaT();
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        assertEquals(-13.42, deltaT.estimate(forDate), 0.01);
    }

}
package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_SingleYearBeyond_1500 {

    @Test
    public void estimateDeltaT_SingleYearBeyond_1500() {
        DeltaT deltaT = new DeltaT();
        LocalDate forDate = LocalDate.of(2002, 1, 1);
        assertEquals(-18.41, deltaT.estimate(forDate), 0.01);
    }

}
package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_SingleYearBeyond_1700 {

    @Test
    public void estimateDeltaT_SingleYearBeyond_1700() {
        DeltaT deltaT = new DeltaT();
        LocalDate forDate = LocalDate.of(2100, 1, 1);
        assertEquals(-27.59, deltaT.estimate(forDate), 0.01);
    }

}
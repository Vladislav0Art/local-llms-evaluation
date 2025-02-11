package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_1820IsNotCorrectWhenYearIs1860Test {

    @Test
    public void estimateDeltaT_1820IsNotCorrectWhenYearIs1860Test() {
        LocalDate forDate = LocalDate.of(1860, 1, 1);
        assertEquals(Double.valueOf(-20), DeltaT.estimate(forDate));
        assertNotEquals(Double.valueOf(63.86), DeltaT.estimate(forDate));
    }

}
package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_1900IsNotCorrectWhenYearIs2000Test {

    @Test
    public void estimateDeltaT_1900IsNotCorrectWhenYearIs2000Test() {
        LocalDate forDate = LocalDate.of(1900, 1, 1);
        assertEquals(Double.valueOf(63.86), DeltaT.estimate(forDate));
        assertNotEquals(Double.valueOf(62.92), DeltaT.estimate(forDate));
    }

}
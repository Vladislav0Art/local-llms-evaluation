package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_1900IsCorrectTest {

    @Test
    public void estimateDeltaT_1900IsCorrectTest() {
        LocalDate forDate = LocalDate.of(1900, 1, 1);
        assertEquals(Double.valueOf(63.86), DeltaT.estimate(forDate));
    }

}
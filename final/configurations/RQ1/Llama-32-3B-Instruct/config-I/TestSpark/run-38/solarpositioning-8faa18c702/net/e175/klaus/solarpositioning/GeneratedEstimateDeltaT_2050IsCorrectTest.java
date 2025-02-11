package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_2050IsCorrectTest {

    @Test
    public void estimateDeltaT_2050IsCorrectTest() {
        LocalDate forDate = LocalDate.of(2050, 1, 1);
        assertEquals(Double.valueOf(62.92), DeltaT.estimate(forDate));
    }

}
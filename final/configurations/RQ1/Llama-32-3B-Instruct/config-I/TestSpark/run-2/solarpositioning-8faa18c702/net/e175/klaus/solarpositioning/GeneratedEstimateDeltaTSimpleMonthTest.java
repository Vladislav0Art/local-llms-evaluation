package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTSimpleMonthTest {

    @Test
    public void estimateDeltaTSimpleMonthTest() {
        LocalDate forDate = LocalDate.of(2022, 12, 1);
        double expectedDeltaT = 1586.45;
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(expectedDeltaT, actualDeltaT, 0.01);
    }

}
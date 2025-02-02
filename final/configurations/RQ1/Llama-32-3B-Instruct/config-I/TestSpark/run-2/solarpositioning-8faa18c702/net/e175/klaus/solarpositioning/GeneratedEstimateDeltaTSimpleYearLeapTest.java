package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTSimpleYearLeapTest {

    @Test
    public void estimateDeltaTSimpleYearLeapTest() {
        LocalDate forDate = LocalDate.of(2024, 2, 29);
        double expectedDeltaT = 1587.03;
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(expectedDeltaT, actualDeltaT, 0.01);
    }

}
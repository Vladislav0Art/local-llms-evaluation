package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTSimpleYearNegativeTest {

    @Test
    public void estimateDeltaTSimpleYearNegativeTest() {
        LocalDate forDate = LocalDate.of(-2022, 1, 1);
        double expectedDeltaT = -20;
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(expectedDeltaT, actualDeltaT, 0.01);
    }

}
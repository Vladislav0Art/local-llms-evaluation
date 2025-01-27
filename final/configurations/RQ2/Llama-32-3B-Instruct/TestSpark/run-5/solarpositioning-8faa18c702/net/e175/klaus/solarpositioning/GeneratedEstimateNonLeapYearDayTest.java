package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateNonLeapYearDayTest {

    @Test
    public void estimateNonLeapYearDayTest() {
        LocalDate forDate = LocalDate.of(2019, 6, 21);
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(12, (int) actualDeltaT, 0);
    }

}
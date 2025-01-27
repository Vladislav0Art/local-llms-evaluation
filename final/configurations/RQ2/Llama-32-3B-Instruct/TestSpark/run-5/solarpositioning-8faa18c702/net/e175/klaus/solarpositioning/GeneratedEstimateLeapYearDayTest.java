package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateLeapYearDayTest {

    @Test
    public void estimateLeapYearDayTest() {
        LocalDate forDate = LocalDate.of(2020, 2, 29);
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(-12, (int) actualDeltaT, 0);
    }

}
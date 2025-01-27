package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateWeekdayTest {

    @Test
    public void estimateWeekdayTest() {
        LocalDate forDate = LocalDate.of(2021, 3, 9);
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(-11, (int) actualDeltaT, 0);
    }

}
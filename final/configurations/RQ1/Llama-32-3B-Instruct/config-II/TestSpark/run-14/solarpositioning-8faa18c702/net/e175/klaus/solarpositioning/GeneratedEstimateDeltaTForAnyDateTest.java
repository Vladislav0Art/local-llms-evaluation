package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTForAnyDateTest {

    @Test
    public void estimateDeltaTForAnyDateTest() {
        LocalDate forDate = LocalDate.of(2015, 6, 15);
        assertEquals(DeltaT.estimate(forDate), (double) forDate.getDayOfYear());
    }

}
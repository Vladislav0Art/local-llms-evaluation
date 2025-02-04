package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateDeltaTForPastCenturyTest() {
        LocalDate forDate = LocalDate.of(1900, 1, 1);
        assertEquals(-20 + 32 * pow((forDate.getYear() - 1820) / 100, 2), DeltaT.estimate(forDate));
    }

    @Test
    public void estimateDeltaTForPastMillenniumTest() {
        LocalDate forDate = LocalDate.of(1999, 1, 1);
        assertEquals(-20 + 32 * pow((forDate.getYear() - 1820) / 100, 2), DeltaT.estimate(forDate));
    }

    @Test
    public void estimateDeltaTForFutureCenturyTest() {
        LocalDate forDate = LocalDate.of(2100, 1, 1);
        assertEquals(-20 + 32 * pow((forDate.getYear() - 1820) / 100, 2), DeltaT.estimate(forDate));
    }

    @Test
    public void estimateDeltaTForAnyDateTest() {
        LocalDate forDate = LocalDate.of(2015, 6, 15);
        assertEquals(DeltaT.estimate(forDate), (double) forDate.getDayOfYear());
    }

}
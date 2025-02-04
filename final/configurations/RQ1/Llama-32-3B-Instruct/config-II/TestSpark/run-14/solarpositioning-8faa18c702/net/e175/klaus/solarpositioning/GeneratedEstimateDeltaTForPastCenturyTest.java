package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTForPastCenturyTest {

    @Test
    public void estimateDeltaTForPastCenturyTest() {
        LocalDate forDate = LocalDate.of(1900, 1, 1);
        assertEquals(-20 + 32 * pow((forDate.getYear() - 1820) / 100, 2), DeltaT.estimate(forDate));
    }

}
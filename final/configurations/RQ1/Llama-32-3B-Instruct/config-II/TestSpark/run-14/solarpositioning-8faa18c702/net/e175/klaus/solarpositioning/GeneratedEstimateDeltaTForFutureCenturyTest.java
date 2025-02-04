package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTForFutureCenturyTest {

    @Test
    public void estimateDeltaTForFutureCenturyTest() {
        LocalDate forDate = LocalDate.of(2100, 1, 1);
        assertEquals(-20 + 32 * pow((forDate.getYear() - 1820) / 100, 2), DeltaT.estimate(forDate));
    }

}
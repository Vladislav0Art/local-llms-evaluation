package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTForSameYear_ReturnsSameValueAsLocalDate {

    @Test
    public void estimateDeltaTForSameYear_ReturnsSameValueAsLocalDate() {
        LocalDate date = LocalDate.of(2023, 10, 31);
        double expected = DeltaT.estimate(date);
        assertEquals(expected, date.getInstant(), 0.000001);
    }

}
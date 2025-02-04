package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void estimateDeltaTForPastCenturies_ReturnsCorrectValue() {
        LocalDate date = LocalDate.of(1700, 1, 1);
        double expected = -20 + 32 * pow(((date.getYear() - 1820) / 100), 2);
        assertEquals(expected, DeltaT.estimate(date));
    }

    @Test
    public void estimateDeltaTForRecentCenturies_ReturnsCorrectValue() {
        LocalDate date = LocalDate.of(2005, 1, 1);
        double expected = -20 + 32 * pow(((date.getYear() - 1820) / 100), 2);
        assertEquals(expected, DeltaT.estimate(date));
    }

    @Test
    public void estimateDeltaTFor1900s_ReturnsCorrectValue() {
        LocalDate date = LocalDate.of(1901, 1, 1);
        double expected = -20 + 32 * pow(((date.getYear() - 1820) / 100), 2);
        assertEquals(expected, DeltaT.estimate(date));
    }

    @Test
    public void estimateDeltaTFor1990s_ReturnsCorrectValue() {
        LocalDate date = LocalDate.of(1999, 1, 1);
        double expected = 63.86 + 0.3345 * ((date.getYear() - 2000) / 100) - 0.060374 * pow(((date.getYear() - 2000) / 100), 2);
        assertEquals(expected, DeltaT.estimate(date));
    }

    @Test
    public void estimateDeltaTForFutureYears_ReturnsCorrectValue() {
        LocalDate date = LocalDate.of(2100, 1, 1);
        double expected = -20 + 32 * pow(((date.getYear() - 1820) / 100), 2) - 0.5628 * (2150 - date.getYear());
        assertEquals(expected, DeltaT.estimate(date));
    }

    @Test
    public void estimateDeltaTForSameYear_ReturnsSameValueAsLocalDate() {
        LocalDate date = LocalDate.of(2023, 10, 31);
        double expected = DeltaT.estimate(date);
        assertEquals(expected, date.getInstant(), 0.000001);
    }

}
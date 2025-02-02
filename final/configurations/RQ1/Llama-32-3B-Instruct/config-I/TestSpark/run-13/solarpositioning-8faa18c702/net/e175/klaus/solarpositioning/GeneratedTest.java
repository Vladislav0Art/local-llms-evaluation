package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedTest {

    @Test
    public void estimateDeltaTCenturiesBefore() {
        LocalDate date = LocalDate.of(1800, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-20.0, deltaT, 0.01);
    }

    @Test
    public void estimateDeltaTFiveMillenniumCanon() {
        LocalDate date = LocalDate.of(1850, 6, 30);
        double deltaT = DeltaT.estimate(date);
        assertEquals(13.72, deltaT, 0.01);
    }

    @Test
    public void estimateDeltaTBetweenFiveMillenniumCanonAndFuture() {
        LocalDate date = LocalDate.of(1901, 12, 31);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow(((date.getYear() - 1820) / 100), 2), deltaT, 0.01);
    }

    @Test
    public void estimateDeltaTBetweenFiveMillenniumCanonAndPast() {
        LocalDate date = LocalDate.of(1850, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow(((date.getYear() - 1820) / 100), 2), deltaT, 0.01);
    }

    @Test
    public void estimateDeltaTCenturiesAfter() {
        LocalDate date = LocalDate.of(2100, 12, 31);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow(((date.getYear() - 1820) / 100), 2) - 0.5628 * (2150 - date.getYear()), deltaT, 0.01);
    }

    @Test
    public void estimateDeltaTFutureWithNonMultipleOf100Years() {
        LocalDate date = LocalDate.of(2101, 12, 31);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow(((date.getYear() - 1820) / 100), 2) - 0.5628 * (2150 - date.getYear()), deltaT, 0.01);
    }

    @Test
    public void estimateDeltaTLargePositiveYear() {
        LocalDate date = LocalDate.of(2501, 12, 31);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow(((date.getYear() - 1820) / 100), 2) - 0.5628 * (2150 - date.getYear()), deltaT, 0.01);
    }

    @Test
    public void estimateDeltaTCenturyWithLeapYear() {
        LocalDate date = LocalDate.of(1904, 12, 31);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow(((date.getYear() - 1820) / 100), 2), deltaT, 0.01);
    }

    @Test
    public void estimateDeltaTFixedDateInTheFuture() {
        LocalDate date = LocalDate.of(2100, 12, 31);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow(((date.getYear() - 1820) / 100), 2), deltaT, 0.01);
    }

    @Test
    public void estimateDeltaTFixedDateInThePast() {
        LocalDate date = LocalDate.of(1800, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow(((date.getYear() - 1820) / 100), 2), deltaT, 0.01);
    }

}
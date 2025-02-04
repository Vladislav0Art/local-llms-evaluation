package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateDeltaTForDateBefore1800Test() {
        LocalDate date = LocalDate.of(1776, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(date);
        assertEquals(-2.79, estimatedDeltaT, 0.01);
    }

    @Test
    public void estimateDeltaTForDateIn1900sTest() {
        LocalDate date = LocalDate.of(1900, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(date);
        assertEquals(-2.79, estimatedDeltaT, 0.01);
    }

    @Test
    public void estimateDeltaTForDateIn2000sTest() {
        LocalDate date = LocalDate.of(2025, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(date);
        assertEquals(62.92, estimatedDeltaT, 0.01);
    }

    @Test
    public void estimateDeltaTForDateIn1800sTest() {
        LocalDate date = LocalDate.of(1823, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(date);
        assertEquals(-2.79, estimatedDeltaT, 0.01);
    }

    @Test
    public void estimateDeltaTForDateIn19thCenturyTest() {
        LocalDate date = LocalDate.of(1856, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(date);
        assertEquals(-2.79, estimatedDeltaT, 0.01);
    }

    @Test
    public void estimateDeltaTForDateIn20thCenturyTest() {
        LocalDate date = LocalDate.of(1956, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(date);
        assertEquals(-2.79, estimatedDeltaT, 0.01);
    }

    @Test
    public void estimateDeltaTForDateIn19thCenturyWithPositiveYearTest() {
        LocalDate date = LocalDate.of(1856, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(date);
        assertEquals(-2.79, estimatedDeltaT, 0.01);
    }

    @Test
    public void estimateDeltaTForDateIn20thCenturyWithNegativeYearTest() {
        LocalDate date = LocalDate.of(1956, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(date);
        assertEquals(-2.79, estimatedDeltaT, 0.01);
    }
}

@Test
public void decimalYearForDateIn1800sTest() {
    LocalDate date = LocalDate.of(1823, 1, 1);
    double estimatedDecimalYear = DeltaT.decimalYear(date);
    assertEquals(183.58333333, estimatedDecimalYear, 0.01);
}

@Test
public void decimalYearForDateIn20thCenturyTest() {
    LocalDate date = LocalDate.of(2025, 1, 1);
    double estimatedDecimalYear = DeltaT.decimalYear(date);
    assertEquals(206.58333333, estimatedDecimalYear, 0.01);
}
	}

@Test
public void decimalYearForDateIn1800sWithNegativeMonthTest() {
    LocalDate date = LocalDate.of(-12, 1, 1);
    double estimatedDecimalYear = DeltaT.decimalYear(date);
    assertEquals(187.5, estimatedDecimalYear, 0.01);
}

@Test
public void decimalYearForDateIn20thCenturyWithPositiveMonthTest() {
    LocalDate date = LocalDate.of(2026, 1, 1);
    double estimatedDecimalYear = DeltaT.decimalYear(date);
    assertEquals(207.83333333, estimatedDecimalYear, 0.01);
}

}
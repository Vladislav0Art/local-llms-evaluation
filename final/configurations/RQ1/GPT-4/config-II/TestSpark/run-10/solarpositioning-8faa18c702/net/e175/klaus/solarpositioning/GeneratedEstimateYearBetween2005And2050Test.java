package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween2005And2050Test {

    @Test
    public void estimateYearBetween2005And2050Test() {
        LocalDate date = LocalDate.of(2025, 5, 1);
        assertTrue(DeltaT.estimate(date) == 72.85552499999999);
    }

}
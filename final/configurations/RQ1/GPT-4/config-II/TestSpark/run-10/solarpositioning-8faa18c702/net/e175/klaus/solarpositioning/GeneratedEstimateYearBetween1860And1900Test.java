package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween1860And1900Test {

    @Test
    public void estimateYearBetween1860And1900Test() {
        LocalDate date = LocalDate.of(1875, 5, 1);
        assertTrue(DeltaT.estimate(date) == 4.831528277669964);
    }

}
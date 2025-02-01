package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween1900And1920Test {

    @Test
    public void estimateYearBetween1900And1920Test() {
        LocalDate date = LocalDate.of(1910, 5, 1);
        assertTrue(DeltaT.estimate(date) == 5.791643152975293);
    }

}
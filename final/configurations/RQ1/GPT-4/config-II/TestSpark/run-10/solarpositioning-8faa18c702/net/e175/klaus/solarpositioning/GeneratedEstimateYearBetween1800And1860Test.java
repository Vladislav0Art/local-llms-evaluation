package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween1800And1860Test {

    @Test
    public void estimateYearBetween1800And1860Test() {
        LocalDate date = LocalDate.of(1850, 5, 1);
        assertTrue(DeltaT.estimate(date) == 11.644066246190746);
    }

}
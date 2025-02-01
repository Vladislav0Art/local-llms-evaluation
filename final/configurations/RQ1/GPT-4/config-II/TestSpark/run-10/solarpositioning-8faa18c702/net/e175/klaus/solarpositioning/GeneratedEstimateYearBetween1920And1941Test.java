package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween1920And1941Test {

    @Test
    public void estimateYearBetween1920And1941Test() {
        LocalDate date = LocalDate.of(1930, 5, 1);
        assertTrue(DeltaT.estimate(date) == 26.080875000000002);
    }

}
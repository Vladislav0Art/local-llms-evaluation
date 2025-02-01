package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween1961And1986Test {

    @Test
    public void estimateYearBetween1961And1986Test() {
        LocalDate date = LocalDate.of(1970, 5, 1);
        assertTrue(DeltaT.estimate(date) == 46.30860625);
    }

}
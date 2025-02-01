package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearAfter2150Test {

    @Test
    public void estimateYearAfter2150Test() {
        LocalDate date = LocalDate.of(2500, 5, 1);
        assertTrue(DeltaT.estimate(date) == 964.0);
    }

}
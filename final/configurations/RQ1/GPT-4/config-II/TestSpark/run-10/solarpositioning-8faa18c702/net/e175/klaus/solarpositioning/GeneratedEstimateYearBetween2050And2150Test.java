package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween2050And2150Test {

    @Test
    public void estimateYearBetween2050And2150Test() {
        LocalDate date = LocalDate.of(2100, 5, 1);
        assertTrue(DeltaT.estimate(date) == 193.328);
    }

}
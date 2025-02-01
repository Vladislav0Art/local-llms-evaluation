package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBeforeMinus500Test {

    @Test
    public void estimateYearBeforeMinus500Test() {
        LocalDate date = LocalDate.of(-1000, 7, 1);
        assertTrue(DeltaT.estimate(date) == -1332.0);
    }

}
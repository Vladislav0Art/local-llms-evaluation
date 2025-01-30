package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearAfter2150Test {

    @Test
    public void estimateYearAfter2150Test() {
        LocalDate forDate = LocalDate.of(2200, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT != 0);
    }

}
package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBefore2005Test {

    @Test
    public void estimateYearBefore2005Test() {
        LocalDate forDate = LocalDate.of(2000, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT != 0);
    }

}
package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBefore1860Test {

    @Test
    public void estimateYearBefore1860Test() {
        LocalDate forDate = LocalDate.of(1850, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT != 0);
    }

}
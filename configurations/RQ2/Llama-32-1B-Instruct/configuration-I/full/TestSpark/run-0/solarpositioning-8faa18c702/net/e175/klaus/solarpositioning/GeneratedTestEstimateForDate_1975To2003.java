package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedTestEstimateForDate_1975To2003 {

    @Test
    public void testEstimateForDate_1975To2003() {
        LocalDate forDate = LocalDate.of(1975, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(2.455, deltaT, 0.01);
    }

}
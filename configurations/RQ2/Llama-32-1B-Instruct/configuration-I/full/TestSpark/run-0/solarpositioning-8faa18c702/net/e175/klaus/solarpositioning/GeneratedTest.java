package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testEstimateForDate_1950To1973() {
        LocalDate forDate = LocalDate.of(1950, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(0.0344, deltaT, 0.01);
    }

    @Test
    public void testEstimateForDate_1975To2003() {
        LocalDate forDate = LocalDate.of(1975, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(2.455, deltaT, 0.01);
    }

    @Test
    public void testEstimateForDate_1999To2009() {
        LocalDate forDate = LocalDate.of(1999, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(3.354, deltaT, 0.01);
    }

}
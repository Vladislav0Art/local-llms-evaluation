package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedTestEstimateForDate_1950To1973 {

    @Test
    public void testEstimateForDate_1950To1973() {
        LocalDate forDate = LocalDate.of(1950, 1, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(0.0344, deltaT, 0.01);
    }

}
package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Date;

public class GeneratedTestEstimateForDate_2013To2023 {

    @Test
    public void testEstimateForDate_2013To2023() {
        LocalDate forDate = LocalDate.of(2013, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(4.394, deltaT, 0.01);
    }

}
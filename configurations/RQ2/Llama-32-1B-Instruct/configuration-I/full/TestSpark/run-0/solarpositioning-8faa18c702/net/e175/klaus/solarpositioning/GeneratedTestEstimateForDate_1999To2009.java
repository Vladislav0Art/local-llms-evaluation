package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedTestEstimateForDate_1999To2009 {

    @Test
    public void testEstimateForDate_1999To2009() {
        LocalDate forDate = LocalDate.of(1999, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertEquals(3.354, deltaT, 0.01);
    }

}
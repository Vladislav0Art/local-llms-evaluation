package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateYearInRange500To1600Test {

    @Test
    public void estimateYearInRange500To1600Test() {
        LocalDate forDate = LocalDate.of(1500, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT > 5000);
    }

}
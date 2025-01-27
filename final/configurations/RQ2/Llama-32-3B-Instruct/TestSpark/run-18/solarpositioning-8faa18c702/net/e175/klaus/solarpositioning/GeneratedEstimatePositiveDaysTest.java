package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimatePositiveDaysTest {

    @Test
    public void estimatePositiveDaysTest() {
        LocalDate forDate = org.junit.platform.datetime.Jdk8DateTime.of(1, 1, 1);
        double deltaT = (double) DeltaT.estimate(forDate);
        assertEquals(-1221399, deltaT);
    }

}
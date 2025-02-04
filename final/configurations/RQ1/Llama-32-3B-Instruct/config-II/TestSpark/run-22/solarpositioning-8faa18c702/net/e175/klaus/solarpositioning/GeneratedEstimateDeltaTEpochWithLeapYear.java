package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTEpochWithLeapYear {

    @Test
    public void estimateDeltaTEpochWithLeapYear() {
        LocalDate forDate = LocalDate.of(2004, 2, 29);
        double result = DeltaT.estimate(forDate);
        assertEquals(2451545.0001, result, 0.01);
    }
}

}
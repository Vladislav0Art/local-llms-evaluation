package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateLeapYearTest {

    @Test
    public void estimateLeapYearTest() {
        LocalDate leapYearDate = LocalDate.of(2020, 2, 29);
        double deltaT = DeltaT.estimate(leapYearDate);

        assertTrue("DeltaT for leap year should be positive", deltaT > 0);
    }

}
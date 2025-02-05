package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateNonLeapYearTest {

    @Test
    public void estimateNonLeapYearTest() {
        LocalDate nonLeapYearDate = LocalDate.of(2019, 2, 28);
        double deltaT = DeltaT.estimate(nonLeapYearDate);

        assertTrue("DeltaT for non-leap year should be positive", deltaT > 0);
    }

}
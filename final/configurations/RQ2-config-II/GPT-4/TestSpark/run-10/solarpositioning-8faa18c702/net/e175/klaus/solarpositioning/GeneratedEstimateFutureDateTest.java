package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        LocalDate futureDate = LocalDate.of(2050, 1, 1);
        double deltaT = DeltaT.estimate(futureDate);

        assertTrue("DeltaT for future date should be positive", deltaT > 0);
    }

}
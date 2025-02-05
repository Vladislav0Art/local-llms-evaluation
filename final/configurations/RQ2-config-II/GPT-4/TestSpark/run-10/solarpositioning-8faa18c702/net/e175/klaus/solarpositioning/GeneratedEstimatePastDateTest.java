package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimatePastDateTest {

    @Test
    public void estimatePastDateTest() {
        LocalDate pastDate = LocalDate.of(1500, 1, 1);
        double deltaT = DeltaT.estimate(pastDate);

        assertTrue("DeltaT for past date should be positive", deltaT > 0);
    }

}
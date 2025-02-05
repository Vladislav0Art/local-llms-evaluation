package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateBoundaryYear2005Test {

    @Test
    public void estimateBoundaryYear2005Test() {
        LocalDate boundaryYear = LocalDate.of(2005, 1, 1);
        double deltaT = DeltaT.estimate(boundaryYear);

        assertTrue("DeltaT for boundary year 2005 should be positive", deltaT > 0);
    }

}
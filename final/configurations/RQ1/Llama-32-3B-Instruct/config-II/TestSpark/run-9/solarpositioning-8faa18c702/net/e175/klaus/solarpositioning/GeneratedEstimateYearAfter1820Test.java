package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearAfter1820Test {

    @Test
    public void estimateYearAfter1820Test() {
        LocalDate forDate = LocalDate.of(1821, 1, 1);
        double expectedDeltaT = -20;
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(expectedDeltaT, actualDeltaT);
    }
}

}
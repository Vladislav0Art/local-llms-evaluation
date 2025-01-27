package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class GeneratedEstimateNegativeDeltaT {

    @Test
    public void estimateNegativeDeltaT() {
        LocalDate date = LocalDate.now().minusDays(10);
        double result = DeltaT.estimate(date);
        assertTrue(result < 0);
    }

}
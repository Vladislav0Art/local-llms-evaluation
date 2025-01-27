package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class GeneratedEstimatePositiveDeltaT {

    @Test
    public void estimatePositiveDeltaT() {
        LocalDate date = LocalDate.now().plusDays(10);
        double result = DeltaT.estimate(date);
        assertTrue(result > 0);
    }

}
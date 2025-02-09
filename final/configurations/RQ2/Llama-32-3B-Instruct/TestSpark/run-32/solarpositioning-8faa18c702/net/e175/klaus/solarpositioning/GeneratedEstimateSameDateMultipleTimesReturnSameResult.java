package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedEstimateSameDateMultipleTimesReturnSameResult {

    @Test
    public void estimateSameDateMultipleTimesReturnSameResult() {
        LocalDate date = LocalDate.of(2010, 6, 21);
        double result1 = DeltaT.estimate(date);
        double result2 = DeltaT.estimate(date);
        assertEquals(result1, result2, 1e-9);
    }

}
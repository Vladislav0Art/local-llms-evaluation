package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateEndOfYearTest {

    @Test
    public void estimateEndOfYearTest() {
        LocalDate endOfYear = LocalDate.of(2021, 12, 31);
        double result = DeltaT.estimate(endOfYear);
        assertEquals(71.14642745881342, result, 0.001);
    }

}
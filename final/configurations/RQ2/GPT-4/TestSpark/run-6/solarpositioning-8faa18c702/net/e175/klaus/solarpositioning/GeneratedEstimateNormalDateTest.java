package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateNormalDateTest {

    @Test
    public void estimateNormalDateTest() {
        LocalDate testDate = LocalDate.of(2021, 05, 23);
        double result = DeltaT.estimate(testDate);
        assertEquals(71.40125536672947, result, 0.001);
    }

}
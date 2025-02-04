package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTSimpleLinearInterpolationTest {

    @Test
    public void estimateDeltaTSimpleLinearInterpolationTest() {
        LocalDate date = LocalDate.of(2022, 1, 20);
        double expectedValue = 59.55;
        assertEquals(expectedValue, DeltaT.estimate(date), 0.01);
    }

}
package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateScenarioTenthTest {

    @Test
    public void estimateScenarioTenthTest() {
        LocalDate date = LocalDate.of(1941, 6, 15);
        double expected = 26.85;
        Assert.assertEquals(expected, DeltaT.estimate(date), 0.01);
    }

}
package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateScenarioEighthTest {

    @Test
    public void estimateScenarioEighthTest() {
        LocalDate date = LocalDate.of(1900, 6, 15);
        double expected = -2.74;
        Assert.assertEquals(expected, DeltaT.estimate(date), 0.01);
    }

}
package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateScenarioSixthTest {

    @Test
    public void estimateScenarioSixthTest() {
        LocalDate date = LocalDate.of(1800, 6, 15);
        double expected = 13.88;
        Assert.assertEquals(expected, DeltaT.estimate(date), 0.01);
    }

}
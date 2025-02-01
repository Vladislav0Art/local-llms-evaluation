package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateScenarioFifteenthTest {

    @Test
    public void estimateScenarioFifteenthTest() {
        LocalDate date = LocalDate.of(2150, 6, 15);
        double expected = 229.84;
        Assert.assertEquals(expected, DeltaT.estimate(date), 0.01);
    }

}
package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateScenarioFourteenthTest {

    @Test
    public void estimateScenarioFourteenthTest() {
        LocalDate date = LocalDate.of(2050, 6, 15);
        double expected = 77.32;
        Assert.assertEquals(expected, DeltaT.estimate(date), 0.01);
    }

}
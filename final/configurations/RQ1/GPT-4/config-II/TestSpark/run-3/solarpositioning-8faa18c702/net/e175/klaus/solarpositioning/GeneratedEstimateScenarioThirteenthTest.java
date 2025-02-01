package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateScenarioThirteenthTest {

    @Test
    public void estimateScenarioThirteenthTest() {
        LocalDate date = LocalDate.of(2005, 6, 15);
        double expected = 64.56;
        Assert.assertEquals(expected, DeltaT.estimate(date), 0.01);
    }

}
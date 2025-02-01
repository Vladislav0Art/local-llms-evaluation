package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateScenarioSecondTest {

    @Test
    public void estimateScenarioSecondTest() {
        LocalDate date = LocalDate.of(0, 6, 15);
        double expected = 10503.94;
        Assert.assertEquals(expected, DeltaT.estimate(date), 0.01);
    }

}
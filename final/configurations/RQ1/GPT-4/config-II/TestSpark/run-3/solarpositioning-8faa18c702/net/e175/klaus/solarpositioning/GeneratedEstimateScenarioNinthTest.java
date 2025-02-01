package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateScenarioNinthTest {

    @Test
    public void estimateScenarioNinthTest() {
        LocalDate date = LocalDate.of(1920, 6, 15);
        double expected = 21.15;
        Assert.assertEquals(expected, DeltaT.estimate(date), 0.01);
    }

}
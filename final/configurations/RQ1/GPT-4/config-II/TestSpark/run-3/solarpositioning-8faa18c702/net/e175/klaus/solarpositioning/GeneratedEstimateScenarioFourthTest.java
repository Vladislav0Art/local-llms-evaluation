package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateScenarioFourthTest {

    @Test
    public void estimateScenarioFourthTest() {
        LocalDate date = LocalDate.of(1600, 6, 15);
        double expected = 118.41;
        Assert.assertEquals(expected, DeltaT.estimate(date), 0.01);
    }

}
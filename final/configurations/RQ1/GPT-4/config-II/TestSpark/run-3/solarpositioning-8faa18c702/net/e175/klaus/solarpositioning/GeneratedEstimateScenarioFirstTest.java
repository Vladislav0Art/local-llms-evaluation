package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateScenarioFirstTest {

    @Test
    public void estimateScenarioFirstTest() {
        LocalDate date = LocalDate.of(-600, 6, 15);
        double expected = 699.04;
        Assert.assertEquals(expected, DeltaT.estimate(date), 0.01);
    }

}
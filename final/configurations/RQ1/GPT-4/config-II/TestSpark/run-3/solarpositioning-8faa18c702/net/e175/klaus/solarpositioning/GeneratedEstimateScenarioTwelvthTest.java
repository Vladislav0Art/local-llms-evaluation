package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateScenarioTwelvthTest {

    @Test
    public void estimateScenarioTwelvthTest() {
        LocalDate date = LocalDate.of(1986, 6, 15);
        double expected = 54.97;
        Assert.assertEquals(expected, DeltaT.estimate(date), 0.01);
    }

}
package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateScenarioSeventhTest {

    @Test
    public void estimateScenarioSeventhTest() {
        LocalDate date = LocalDate.of(1860, 6, 15);
        double expected = 7.64;
        Assert.assertEquals(expected, DeltaT.estimate(date), 0.01);
    }

}
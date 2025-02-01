package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateScenarioEleventhTest {

    @Test
    public void estimateScenarioEleventhTest() {
        LocalDate date = LocalDate.of(1961, 6, 15);
        double expected = 34.10;
        Assert.assertEquals(expected, DeltaT.estimate(date), 0.01);
    }

}
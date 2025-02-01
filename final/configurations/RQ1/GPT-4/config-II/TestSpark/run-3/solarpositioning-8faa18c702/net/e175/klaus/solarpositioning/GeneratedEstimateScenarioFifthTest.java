package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateScenarioFifthTest {

    @Test
    public void estimateScenarioFifthTest() {
        LocalDate date = LocalDate.of(1700, 6, 15);
        double expected = 10.05;
        Assert.assertEquals(expected, DeltaT.estimate(date), 0.01);
    }

}
package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateScenarioSixteenthTest {

    @Test
    public void estimateScenarioSixteenthTest() {
        LocalDate date = LocalDate.of(2300, 6, 15);
        double expected = 850.43;
        Assert.assertEquals(expected, DeltaT.estimate(date), 0.01);
    }

}
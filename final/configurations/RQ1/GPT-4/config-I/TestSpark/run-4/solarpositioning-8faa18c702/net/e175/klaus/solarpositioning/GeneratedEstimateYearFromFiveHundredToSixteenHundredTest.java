package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearFromFiveHundredToSixteenHundredTest {

    /**
     * Test for estimate method of DeltaT class.
     */

    @Test
    public void estimateYearFromFiveHundredToSixteenHundredTest() {
        LocalDate forDate = LocalDate.of(1500, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        Assert.assertTrue(deltaT == 17820.913020539284);
    }

}
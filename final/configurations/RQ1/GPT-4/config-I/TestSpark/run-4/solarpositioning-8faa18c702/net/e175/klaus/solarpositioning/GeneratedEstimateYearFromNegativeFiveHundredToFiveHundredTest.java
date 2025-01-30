package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearFromNegativeFiveHundredToFiveHundredTest {

    /**
     * Test for estimate method of DeltaT class.
     */

    @Test
    public void estimateYearFromNegativeFiveHundredToFiveHundredTest() {
        LocalDate forDate = LocalDate.of(0, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        Assert.assertTrue(deltaT == 17190.91821742031);
    }

}
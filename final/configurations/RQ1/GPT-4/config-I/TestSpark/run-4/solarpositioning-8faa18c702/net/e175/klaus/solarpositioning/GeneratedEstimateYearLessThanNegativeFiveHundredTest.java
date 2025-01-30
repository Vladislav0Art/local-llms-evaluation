package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLessThanNegativeFiveHundredTest {

    /**
     * Test for estimate method of DeltaT class.
     */

    @Test
    public void estimateYearLessThanNegativeFiveHundredTest() {
        LocalDate forDate = LocalDate.of(-600, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        Assert.assertTrue(deltaT == 16600.0);
    }

}
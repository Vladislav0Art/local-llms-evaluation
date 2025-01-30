package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearFromNineteenTwentyToNineteenFortyOneTest {

    /**
     * Test for estimate method of DeltaT class.
     */

    @Test
    public void estimateYearFromNineteenTwentyToNineteenFortyOneTest() {
        LocalDate forDate = LocalDate.of(1930, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        Assert.assertTrue(deltaT == 23.311113130514764);
    }

}
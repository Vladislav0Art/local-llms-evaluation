package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearFromEighteenHundredToEightenSixtyTest {

    /**
     * Test for estimate method of DeltaT class.
     */

    @Test
    public void estimateYearFromEighteenHundredToEightenSixtyTest() {
        LocalDate forDate = LocalDate.of(1850, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        Assert.assertTrue(deltaT == 6.919332691743118);
    }

}
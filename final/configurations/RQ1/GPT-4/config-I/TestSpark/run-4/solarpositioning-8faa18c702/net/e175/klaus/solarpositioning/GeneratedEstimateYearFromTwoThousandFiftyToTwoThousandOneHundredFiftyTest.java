package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearFromTwoThousandFiftyToTwoThousandOneHundredFiftyTest {

    /**
     * Test for estimate method of DeltaT class.
     */

    @Test
    public void estimateYearFromTwoThousandFiftyToTwoThousandOneHundredFiftyTest() {
        LocalDate forDate = LocalDate.of(2070, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        Assert.assertTrue(deltaT == 83.00000000000003);
    }

}
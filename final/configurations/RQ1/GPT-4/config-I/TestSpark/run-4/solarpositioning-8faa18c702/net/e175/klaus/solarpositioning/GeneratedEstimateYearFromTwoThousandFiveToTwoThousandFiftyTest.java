package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearFromTwoThousandFiveToTwoThousandFiftyTest {

    /**
     * Test for estimate method of DeltaT class.
     */

    @Test
    public void estimateYearFromTwoThousandFiveToTwoThousandFiftyTest() {
        LocalDate forDate = LocalDate.of(2030, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        Assert.assertTrue(deltaT == 66.30408384375);
    }

}
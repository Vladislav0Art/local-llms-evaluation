package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateCurrentDateTest {

    @Test
    public void estimateCurrentDateTest() {
        LocalDate currentDate = LocalDate.now();

        double result = DeltaT.estimate(currentDate);

        Assert.assertNotNull(result);
        Assert.assertTrue(result > 0);
    }

}
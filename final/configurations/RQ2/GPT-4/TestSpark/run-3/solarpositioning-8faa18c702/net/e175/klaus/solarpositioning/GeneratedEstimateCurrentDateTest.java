package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;

public class GeneratedEstimateCurrentDateTest {

    @Test
    public void estimateCurrentDateTest() {
        LocalDate currentDate = LocalDate.now();
        double delta = DeltaT.estimate(currentDate);

        Assert.assertTrue(delta > 0);
    }

}